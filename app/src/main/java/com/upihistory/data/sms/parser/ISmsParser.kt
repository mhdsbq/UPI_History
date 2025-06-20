package com.upihistory.data.sms.parser

import com.upihistory.data.model.SmsMessage
import com.upihistory.data.model.UpiTransaction

interface ISmsParser {
    val senderId: String
    fun parse(sms: SmsMessage): UpiTransaction
}