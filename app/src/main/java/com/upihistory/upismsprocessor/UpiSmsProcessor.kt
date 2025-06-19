package com.upihistory.upismsprocessor

import com.upihistory.upismsprocessor.model.UpiSms
import com.upihistory.upismsprocessor.model.UpiTransaction
import com.upihistory.upismsprocessor.parser.ParserRegistry
import com.upihistory.upismsprocessor.parser.bank.FiFederalSmsParser
import com.upihistory.upismsprocessor.parser.bank.SbiSmsParser

class UpiSmsProcessor {
    private var parserRegistry: ParserRegistry = ParserRegistry(
        listOf(SbiSmsParser(), FiFederalSmsParser())
    )

//    fun processSms(message: String): UpiTransaction {
//        throw NotImplementedError();
//    }

    fun processSms(message: UpiSms): UpiTransaction? {
        val parser = parserRegistry.getParser(message.author);
        return parser?.parse(message);
    }
//
//    fun processSms(messages: List<String>): List<UpiTransaction> {
//        throw NotImplementedError();
//    }

    fun processSms(messages: List<UpiSms>): List<UpiTransaction> {
        throw NotImplementedError();
    }
}