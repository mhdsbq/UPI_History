package com.upihistory.data.sms.parser.bank

import com.upihistory.data.model.Bank
import com.upihistory.data.model.TransactionType
import com.upihistory.data.model.SmsMessage
import com.upihistory.data.model.UpiTransaction
import com.upihistory.data.sms.parser.ISmsParser

class SbiUpiParser : ISmsParser {
    override val senderId: String = "SBIUPI"

    private val regex = Regex(
        """A/C\sX\d+\sdebited\sby\s(?<amount>\d+\.\d+)\son\sdate\s(?<date>\d{2}[A-Za-z]{3}\d{2})\strf\sto\s(?<receiver>[\w\s]+)\sRefno\s(?<ref>\d+)""",
        RegexOption.IGNORE_CASE
    )

    override fun parse(sms: SmsMessage): UpiTransaction {
        val match = regex.find(sms.body)
            ?: throw IllegalArgumentException("Unrecognized SBI SMS format: ${sms.body}")

        val amountPaise = ((match.groups["amount"]?.value?.toDoubleOrNull() ?: 0.0) * 100).toInt()
        val receiver = match.groups["receiver"]?.value?.trim()
        val txId = match.groups["ref"]?.value

        return UpiTransaction().apply {
            amount = amountPaise
            timestamp = sms.date// We are using the sms time since SBI SMS does not provide a specific time
            bank = Bank.SBI
            transactionType = TransactionType.DEBIT
            receiverName = receiver
            transactionId = txId
        }
    }
}
