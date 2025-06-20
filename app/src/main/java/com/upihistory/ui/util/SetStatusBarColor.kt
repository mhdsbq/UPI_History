package com.upihistory.ui.util

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowInsetsControllerCompat

@Composable
fun SetStatusBarColor(color: Color? = null) {
    val view = LocalView.current
    val context = LocalContext.current
    val window = (context as? Activity)?.window

    val statusBarColor = color?.toArgb() ?: MaterialTheme.colorScheme.background.toArgb()
    val useDarkIcons = MaterialTheme.colorScheme.background.luminance() > 0.5

    SideEffect {
        window?.let {
            it.statusBarColor = statusBarColor
            WindowInsetsControllerCompat(it, view).isAppearanceLightStatusBars = useDarkIcons
        }
    }
}