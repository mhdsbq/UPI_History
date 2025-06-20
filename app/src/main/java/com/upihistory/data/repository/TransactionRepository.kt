package com.upihistory.data.repository

import com.upihistory.data.model.UpiTransaction

class TransactionRepository {

    private var transactions: List<UpiTransaction> = emptyList()
    fun getTransactions(): List<UpiTransaction> {
        // This method would typically interact with a database or data source
        // to retrieve a list of UpiTransaction objects.
        return transactions
    }

    fun getLastTransaction(): UpiTransaction? {
        // This method would typically interact with a database or data source
        // to retrieve the most recent UpiTransaction object.
        return null // Placeholder for actual implementation
    }

    fun addTransactions(transactions: List<UpiTransaction>) {
        // This method would typically interact with a database or data source
        // to add a list of UpiTransaction objects.
        // Placeholder for actual implementation
        this.transactions += transactions
    }
}