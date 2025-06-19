package com.upihistory.upismsprocessor.model

class UpiSms {
    constructor(author: String, body: String, date: String) {
        this.author = author
        this.body = body
        this.date = date
    }
    var author: String = ""
    var body: String = ""
    var date: String = ""
}