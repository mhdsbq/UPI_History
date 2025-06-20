package com.upihistory.data.model

class UpiTransaction {
    /** Amount in Paise (1 Rupee = 100 Paise) */
    var amount: Int = 0

    /** Transaction date and time as Unix timestamp (seconds since epoch) */
    var timestamp: Long = 0L

    /** Bank associated with the transaction */
    var bank: Bank = Bank.UNKNOWN

    /** Type of transaction: SENT or RECEIVED */
    var transactionType: TransactionType = TransactionType.DEBIT

    /** Name of the sender (person or entity who sent the money) */
    var senderName: String? = ""

    /** Name of the receiver (person or entity who received the money) */
    var receiverName: String? = ""

    /** Virtual Payment Address (VPA) of the sender */
    var senderVpa: String? = ""

    /** Virtual Payment Address (VPA) of the receiver */
    var receiverVpa: String? = ""

    /** Unique transaction ID assigned by the payment system */
    var transactionId: String? = ""
}
