package com.upihistory.upismsprocessor.parser

import com.upihistory.upismsprocessor.model.UpiSms
import com.upihistory.upismsprocessor.model.UpiTransaction

interface ISmsParser {
    val senderId: String
    fun parse(sms: UpiSms): UpiTransaction
}