package com.upihistory.data.sms.parser.bank

import com.upihistory.data.model.Bank
import com.upihistory.data.model.TransactionType
import com.upihistory.data.model.SmsMessage
import com.upihistory.data.model.UpiTransaction
import com.upihistory.data.sms.parser.ISmsParser
import java.text.SimpleDateFormat
import java.util.*

class FedBnkParser : ISmsParser {
    override val senderId: String = "FEDBNK"

    private val sdf = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH)


    private val regex = Regex(
        """Rs\s(?<amount>\d+\.\d{2})\sdebited\svia\sUPI\son\s(?<date>\d{2}-\d{2}-\d{4})\s(?<time>\d{2}:\d{2}:\d{2})\sto\sVPA\s(?<vpa>[\w@\.]+)\.Ref\sNo\s(?<ref>\d+)""",
        RegexOption.IGNORE_CASE
    )

    override fun parse(sms: SmsMessage): UpiTransaction {
        val match = regex.find(sms.body) ?: throw IllegalArgumentException("Unrecognized SMS format: ${sms.body}")

        val txAmount = (((match.groups["amount"]?.value?.toDoubleOrNull() ?: (0.0 * 100))) * 100).toInt()
        val dateStr = match.groups["date"]?.value ?: sms.date
        val timeStr = match.groups["time"]?.value ?: ""
        val datetime = "$dateStr $timeStr"

        val time = try {
            sdf.parse(datetime)?.time ?: sms.date
        } catch (e: Exception) {
            sms.date
        }

        return UpiTransaction().apply {
            bank = Bank.FEDERAL
            transactionType = TransactionType.DEBIT
            receiverVpa = match.groups["vpa"]?.value ?: ""
            timestamp = time
            amount = txAmount
        }
    }
}
