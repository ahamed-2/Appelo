package com.appelo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.appelo.ui.HomeScreen
import com.appelo.ui.theme.AppeloTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppeloTheme {
                HomeScreen()
            }
        }
    }
}
