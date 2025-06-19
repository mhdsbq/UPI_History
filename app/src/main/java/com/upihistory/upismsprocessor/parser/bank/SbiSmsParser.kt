package com.upihistory.upismsprocessor.parser.bank

import com.upihistory.upismsprocessor.enum.BankName
import com.upihistory.upismsprocessor.enum.TransactionType
import com.upihistory.upismsprocessor.model.UpiSms
import com.upihistory.upismsprocessor.model.UpiTransaction
import com.upihistory.upismsprocessor.parser.ISmsParser
import java.text.SimpleDateFormat
import java.util.*

class SbiSmsParser : ISmsParser {
    override val senderId: String = "SBIUPI"

    private val regex = Regex(
        """A/C\sX\d+\sdebited\sby\s(?<amount>\d+\.\d+)\son\sdate\s(?<date>\d{2}[A-Za-z]{3}\d{2})\strf\sto\s(?<receiver>[\w\s]+)\sRefno\s(?<ref>\d+)""",
        RegexOption.IGNORE_CASE
    )

    override fun parse(sms: UpiSms): UpiTransaction {
        val match = regex.find(sms.body)
            ?: throw IllegalArgumentException("Unrecognized SBI SMS format: ${sms.body}")

        val amountRupee = ((match.groups["amount"]?.value?.toDoubleOrNull() ?: 0.0) * 100).toInt()
        val receiver = match.groups["receiver"]?.value?.trim()
        val txId = match.groups["ref"]?.value

        return UpiTransaction().apply {
            amount = amountRupee * 100 // Convert to paise
            timestamp = sms.date.toInt() // We are using the sms time since SBI SMS does not provide a specific time
            bankName = BankName.SBI
            transactionType = TransactionType.DEBIT
            receiverName = receiver
            transactionId = txId
        }
    }
}
