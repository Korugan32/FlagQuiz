package com.korugan.flagquiz.presentation.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import com.korugan.flagquiz.presentation.screen.main.components.Buttons
import com.korugan.flagquiz.presentation.screen.main.components.FinalResult
import com.korugan.flagquiz.presentation.screen.main.components.Flag
import com.korugan.flagquiz.presentation.screen.main.components.Result
import com.korugan.flagquiz.presentation.theme.DarkGreen
import com.korugan.flagquiz.util.Country.Companion.countries

@Composable
fun MainScreen() {
    val correctCount = remember { mutableIntStateOf(0) }
    val incorrectCount = remember { mutableIntStateOf(0) }
    val status = remember { mutableStateOf(true) }
    val isCorrect = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(colors = listOf(DarkGreen, Color.Black))),
    ) {
        if (correctCount.intValue + incorrectCount.intValue != countries.size) {
            Flag(correctCount = correctCount, incorrectCount = incorrectCount)

            if (status.value) {
                Buttons(
                    correctCount = correctCount,
                    incorrectCount = incorrectCount,
                    isCorrect = isCorrect,
                    status = status,
                )
            } else {
                Result(
                    status = status,
                    isCorrect = isCorrect,
                )
            }
        } else {
            FinalResult(correctCount = correctCount, incorrectCount = incorrectCount)
        }
    }
}

@Composable
fun screenHeight(): Int = LocalConfiguration.current.screenHeightDp

@Composable
fun screenWidth(): Int = LocalConfiguration.current.screenWidthDp