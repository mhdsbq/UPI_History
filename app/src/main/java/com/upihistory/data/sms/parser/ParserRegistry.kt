package com.upihistory.data.sms.parser

class ParserRegistry(parsers: List<ISmsParser>) {
    private val parserMap: Map<String, ISmsParser> = parsers.associateBy { it.senderId }

    fun getParser(author: String): ISmsParser? {
        if (author.isBlank()) {
            return null
        }

        return try {
            val senderId = author.split("-")[1]
            return parserMap[senderId]
        } catch (e: Exception) {
            println("Error getting parser for author $author: ${e.message}")
            null
        }
    }
}