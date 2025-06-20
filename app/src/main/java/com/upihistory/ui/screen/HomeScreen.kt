package com.upihistory.ui.screen

import TransactionHistory
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.upihistory.data.model.UpiTransaction
import com.upihistory.data.repository.TransactionRepository
import com.upihistory.data.service.TransactionService
import com.upihistory.data.sms.SmsRepository
import com.upihistory.data.sms.SmsService
import com.upihistory.data.sms.parser.ParserRegistry
import com.upihistory.data.sms.parser.bank.FedBnkParser
import com.upihistory.data.sms.parser.bank.SbiUpiParser
import com.upihistory.ui.component.NoTransactionsPage

@Composable
fun HomeScreen() {
    var transactions by remember { mutableStateOf(emptyList<UpiTransaction>()) }

    val smsRepository = SmsRepository(LocalContext.current)
    val parserRegistry = ParserRegistry(listOf(FedBnkParser(), SbiUpiParser()))
    val smsService = SmsService(parserRegistry, smsRepository)
    val transactionRepository = TransactionRepository()
    val transactionService = TransactionService(transactionRepository, smsService)

    LaunchedEffect(Unit) {
        transactionService.loadNewTransactions()
        transactions = transactionService.getAllTransactions()
    }
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        if (transactions.isEmpty()) {
            NoTransactionsPage()
        } else {
            TransactionHistory(transactions)
        }
    }
}