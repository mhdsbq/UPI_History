package com.upihistory

import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import com.upihistory.ui.screen.HomeScreen
import com.upihistory.ui.screen.PermissionRequestScreen
import com.upihistory.ui.theme.UPIHistoryTheme
import com.upihistory.ui.util.SetStatusBarColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            UPIHistoryTheme {
                SetStatusBarColor()
                PermissionHandler()
            }
        }
    }
}

@Composable
fun PermissionHandler() {
    val context = LocalContext.current
    var permissionGranted by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.READ_SMS
            ) == android.content.pm.PackageManager.PERMISSION_GRANTED
        )
    }

    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        permissionGranted = isGranted
    }

    if (permissionGranted) {
        HomeScreen()
    } else {
        PermissionRequestScreen(onRequestPermission = {
            launcher.launch(Manifest.permission.READ_SMS)
        })
    }
}