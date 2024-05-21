package com.korugan.flagquiz

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import com.korugan.flagquiz.Components.Buttons
import com.korugan.flagquiz.Components.FinalResult
import com.korugan.flagquiz.Components.Flag
import com.korugan.flagquiz.Components.Result
import com.korugan.flagquiz.ui.theme.DarkGreen
import com.korugan.flagquiz.ui.theme.FlagQuizTheme

@Composable
fun MainScreen() {
    val correctCount = remember {
        mutableStateOf(0)
    }
    val incorrectCount = remember {
        mutableStateOf(0)
    }
    val status = remember {
        mutableStateOf(true)
    }
    val isCorrect = remember {
        mutableStateOf(false)
    }

    val backGround = Brush.verticalGradient(colors = listOf(DarkGreen, Color.Black))

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backGround)
    ) {
        if (correctCount.value + incorrectCount.value != countries.size) {
            Flag(correctCount = correctCount, incorrectCount = incorrectCount)
            if (status.value) {
                Buttons(
                    correctCount = correctCount,
                    incorrectCount = incorrectCount,
                    isCorrect = isCorrect, status = status
                )
            } else {
                Result(
                    status = status,
                    isCorrect = isCorrect
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


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FlagQuizTheme {
        MainScreen()
    }
}