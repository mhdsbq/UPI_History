package com.upihistory.data.sms

import com.upihistory.data.model.SmsMessage
import com.upihistory.data.model.UpiTransaction
import com.upihistory.data.sms.parser.ParserRegistry

class SmsService(
    private val parserRegistry: ParserRegistry,
    private val smsRepository: SmsRepository
) {
    fun getSmsTransactions(fromDate: Long = 0L): List<UpiTransaction> {
        val smsMessages = smsRepository.readAllMessages(fromDate)
        return smsMessages.mapNotNull { parseSms(it) }
    }

    private fun parseSms(message: SmsMessage): UpiTransaction? {
        val parser = parserRegistry.getParser(message.author)

        //
        return try {
            parser?.parse(message)
        } catch (e: Exception) {
            if(message.body.contains("UPI")) {
                println("Error parsing SMS from ${message.author}: ${e.message}")
            }
            null;
        }
    }
}