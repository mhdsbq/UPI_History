package com.upihistory.data.model

data class SmsMessage(
    var id: String,
    var author: String,
    var body: String,
    var date: Long,
)