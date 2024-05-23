package com.korugan.flagquiz.presentation.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.korugan.flagquiz.presentation.screen.main.MainScreen
import com.korugan.flagquiz.presentation.theme.FlagQuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlagQuizTheme {
                MainScreen()
            }
        }
    }
}

