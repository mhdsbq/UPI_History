package com.upihistory.data.sms.parser.bank

import com.upihistory.data.model.*
import org.junit.Assert.*
import org.junit.Test
import java.text.SimpleDateFormat
import java.util.*

class FedBnkParserTest {

    private val parser = FedBnkParser()
    private val sdf = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH)

    @Test
    fun parse_validSmsMessages_shouldReturnExpectedUpiTransactions() {
        val testCases = listOf(
            Pair(
                SmsMessage(
                    id = "1",
                    author = "FEDBNK",
                    body = "Rs 100.99 debited via UPI on 13-09-2024 13:12:05 to VPA test1@upi.Ref No 012345678912.Small txns?Use UPI Lite!-Federal Bank",
                    date = 0L
                ),
                UpiTransaction().apply {
                    bank = Bank.FEDERAL
                    transactionType = TransactionType.DEBIT
                    receiverVpa = "test1@upi"
                    amount = 10099
                    timestamp = sdf.parse("13-09-2024 13:12:05")!!.time
                }
            ),
            Pair(
                SmsMessage(
                    id = "2",
                    author = "FEDBNK",
                    body = "Rs 145.00 debited from your A/c using UPI on 15-01-2024 16:39:25 to VPA q41577785@ybl - (UPI Ref No 401516498426)-Federal Bank",
                    date = 0L
                ),
                UpiTransaction().apply {
                    bank = Bank.FEDERAL
                    transactionType = TransactionType.DEBIT
                    receiverVpa = "someone@okaxis"
                    amount = 123456
                    timestamp = sdf.parse("01-01-2024 08:00:00")!!.time
                }
            )
        )

        for ((sms, expected) in testCases) {
            val result = parser.parse(sms)

            assertEquals(expected.bank, result.bank)
            assertEquals(expected.transactionType, result.transactionType)
            assertEquals(expected.receiverVpa, result.receiverVpa)
            assertEquals(expected.amount, result.amount)

            val resultSeconds = result.timestamp / 1000
            val expectedSeconds = expected.timestamp / 1000
            assertEquals("Timestamp mismatch", expectedSeconds, resultSeconds)
        }
    }
}
