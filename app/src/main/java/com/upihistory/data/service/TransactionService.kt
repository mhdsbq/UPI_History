package com.upihistory.data.service

import com.upihistory.data.model.UpiTransaction
import com.upihistory.data.repository.TransactionRepository
import com.upihistory.data.sms.SmsService

class TransactionService(
    private val transactionRepository: TransactionRepository,
    private val smsService: SmsService
) {

    fun loadNewTransactions() {
        val lastTransaction = transactionRepository.getLastTransaction()
        val newTransactions = smsService.getSmsTransactions(lastTransaction?.timestamp ?: 0L)
        transactionRepository.addTransactions(newTransactions)
    }

    fun getAllTransactions(): List<UpiTransaction> {
        return transactionRepository.getTransactions()
    }


}