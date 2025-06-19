package com.upihistory

import TransactionHistory
import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Telephony
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.upihistory.ui.theme.UPIHistoryTheme
import com.upihistory.upismsprocessor.UpiSmsProcessor
import com.upihistory.upismsprocessor.model.UpiSms

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Check for permissions
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.READ_SMS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.READ_SMS), 0)
        }

        var messages = getAllSms()
        messages.filter { it.author.contains("UPI", ignoreCase = true) || it.body.contains("UPI", ignoreCase = true) }.also { messages = it }

        val upiSmsProcessor = UpiSmsProcessor()
        val transactions = messages.mapNotNull { message ->
            try {
                upiSmsProcessor.processSms(UpiSms(author = message.author, body = message.body, date = message.date))
            } catch (e: Exception) {
                null
            }
        }
        println(transactions)

        setContent {
            UPIHistoryTheme {
                SetStatusBarColorToBackground();

                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TransactionHistory(
                        transactions
                    )
                }
            }
        }
    }

    private fun getAllSms(): List<Message> {
        val smsList = mutableListOf<Message>()
        val uri: Uri = Telephony.Sms.CONTENT_URI
        val projection = arrayOf(Telephony.Sms.ADDRESS, Telephony.Sms.BODY, Telephony.Sms.DATE)

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_SMS) == PackageManager.PERMISSION_GRANTED) {
            contentResolver.query(uri, projection, null, null, null)?.use { cursor ->
                val addressIndex = cursor.getColumnIndex(Telephony.Sms.ADDRESS)
                val bodyIndex = cursor.getColumnIndex(Telephony.Sms.BODY)
                val dateIndex = cursor.getColumnIndex(Telephony.Sms.DATE)

                while (cursor.moveToNext()) {
                    val address = cursor.getString(addressIndex) ?: "Unknown"
                    val body = cursor.getString(bodyIndex) ?: "No Content"
                    val date = cursor.getString(dateIndex) ?: "Unknown Date"
                    smsList.add(Message(author = address, body = body, date = date))
                }
            }
        }
        return smsList
    }
}


@Composable
fun SetStatusBarColorToBackground() {
    val view = LocalView.current
    val context = LocalContext.current
    val window = (context as? Activity)?.window

    // Extract color inside composable context
    val statusBarColor = MaterialTheme.colorScheme.background.toArgb()
    val useDarkIcons = MaterialTheme.colorScheme.background.luminance() > 0.5

    SideEffect {
        window?.let {
            it.statusBarColor = statusBarColor
            WindowInsetsControllerCompat(it, view).isAppearanceLightStatusBars = useDarkIcons
        }
    }
}



data class Message(
    val author: String, val body: String, val date: String
)

