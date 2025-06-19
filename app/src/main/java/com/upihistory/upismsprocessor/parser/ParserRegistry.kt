package com.upihistory.upismsprocessor.parser

import com.upihistory.upismsprocessor.parser.bank.SbiSmsParser

class ParserRegistry(parsers: List<ISmsParser>) {
    private val parserMap: Map<String, ISmsParser> = parsers.associateBy { it.senderId }

    fun getParser(author: String): ISmsParser? {
        if (author.isBlank()) {
            return null
        }
        val senderId = author.split("-")[1]
        return parserMap[senderId]
    }
}