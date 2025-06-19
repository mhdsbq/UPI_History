package com.upihistory.upismsprocessor.parser.bank

import com.upihistory.upismsprocessor.enum.BankName
import com.upihistory.upismsprocessor.enum.TransactionType
import com.upihistory.upismsprocessor.model.UpiSms
import com.upihistory.upismsprocessor.model.UpiTransaction
import com.upihistory.upismsprocessor.parser.ISmsParser
import java.text.SimpleDateFormat
import java.util.*

class FiFederalSmsParser : ISmsParser {
    override val senderId: String = "FEDBNK"

    private val regex = Regex(
        """Rs\s(?<amount>\d+\.\d{2})\sdebited\svia\sUPI\son\s(?<date>\d{2}-\d{2}-\d{4})\s(?<time>\d{2}:\d{2}:\d{2})\sto\sVPA\s(?<vpa>[\w@\.]+)\.Ref\sNo\s(?<ref>\d+)""",
        RegexOption.IGNORE_CASE
    )

    override fun parse(sms: UpiSms): UpiTransaction {
        val match = regex.find(sms.body) ?: throw IllegalArgumentException("Unrecognized SMS format: ${sms.body}")

        val txAmount = (match.groups["amount"]?.value?.toDoubleOrNull() ?: 0.0 * 100).toInt()
        val dateStr = match.groups["date"]?.value ?: sms.date
        val timeStr = match.groups["time"]?.value ?: ""
        val datetime = "$dateStr $timeStr"

        val time = try {
            val sdf = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH)
            (sdf.parse(datetime)?.time ?: 0L) / 1000
        } catch (e: Exception) {
            0
        }.toInt()

        return UpiTransaction().apply {
            bankName = BankName.FEDERAL
            transactionType = TransactionType.DEBIT
            receiverVpa = match.groups["vpa"]?.value ?: ""
            timestamp = time
            amount = txAmount * 100
        }
    }
}
