package com.upihistory.data.sms

import android.content.Context
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.provider.Telephony
import androidx.core.content.ContextCompat
import com.upihistory.data.model.SmsMessage

class SmsRepository(private val context: Context) {
    class SmsPermissionException(message: String) : Exception(message)

    fun readAllMessages(fromDate: Long = 0L): List<SmsMessage> {
        // Check for SMS read permission
        val hasPermission = ContextCompat.checkSelfPermission(context, android.Manifest.permission.READ_SMS) == PackageManager.PERMISSION_GRANTED
        if (!hasPermission) {
            throw SmsPermissionException("READ_SMS permission is required to read SMS messages.")
        }

        val smsList = mutableListOf<SmsMessage>()
        val uriSms: Uri = Telephony.Sms.Inbox.CONTENT_URI
        val selection = "${Telephony.Sms.DATE} >= ?"
        val selectionArgs = arrayOf(fromDate.toString())
        val cursor: Cursor? = context.contentResolver.query(
            uriSms,
            arrayOf(Telephony.Sms._ID, Telephony.Sms.ADDRESS, Telephony.Sms.BODY, Telephony.Sms.DATE),
            selection,
            selectionArgs,
            Telephony.Sms.DATE + " DESC",
        )

        cursor?.use {
            val idIndex = it.getColumnIndexOrThrow(Telephony.Sms._ID)
            val addressIndex = it.getColumnIndexOrThrow(Telephony.Sms.ADDRESS)
            val bodyIndex = it.getColumnIndexOrThrow(Telephony.Sms.BODY)
            val dateIndex = it.getColumnIndexOrThrow(Telephony.Sms.DATE)

            while (it.moveToNext()) {
                val id = it.getString(idIndex)
                val address = it.getString(addressIndex)
                val body = it.getString(bodyIndex)
                val date = it.getLong(dateIndex)

                smsList.add(SmsMessage(id, address, body, date))
            }
        }

        return smsList
    }
}
