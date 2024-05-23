package com.korugan.flagquiz.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import com.korugan.flagquiz.presentation.screen.main.screenWidth
import com.korugan.flagquiz.presentation.theme.LightGreen
import com.korugan.flagquiz.util.checkAnswer
import com.korugan.flagquiz.util.Country.Companion.countries
import com.korugan.flagquiz.util.array
import com.korugan.flagquiz.util.randomIndexGenerator

@Composable
fun Buttons(
    correctCount: MutableState<Int>,
    incorrectCount: MutableState<Int>,
    isCorrect: MutableState<Boolean>,
    status: MutableState<Boolean>,
) {
    val options = array()
    val indices = randomIndexGenerator()

    Column {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Button(
                onClick = {
                    checkAnswer(
                        indices[0],
                        correctCount,
                        incorrectCount,
                        isCorrect,
                        status,
                    )
                },
                modifier = Modifier.width(screenWidth() * 0.7.dp),
                colors = ButtonDefaults.buttonColors(LightGreen),
            ) {
                Text(text = countries[options[indices[0]]].name)
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Button(
                onClick = {
                    checkAnswer(
                        indices[1],
                        correctCount,
                        incorrectCount,
                        isCorrect,
                        status,
                    )
                },
                modifier = Modifier.width(screenWidth() * 0.7.dp),
                colors = ButtonDefaults.buttonColors(LightGreen),
            ) {
                Text(text = countries[options[indices[1]]].name)
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Button(
                onClick = {
                    checkAnswer(
                        indices[2],
                        correctCount,
                        incorrectCount,
                        isCorrect,
                        status,
                    )
                },
                modifier = Modifier.width(screenWidth() * 0.7.dp),
                colors = ButtonDefaults.buttonColors(LightGreen),
            ) {
                Text(text = countries[options[indices[2]]].name)
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Button(
                onClick = {
                    checkAnswer(
                        indices[3],
                        correctCount,
                        incorrectCount,
                        isCorrect,
                        status
                    )
                },
                modifier = Modifier.width(screenWidth() * 0.7.dp),
                colors = ButtonDefaults.buttonColors(LightGreen),
            ) {
                Text(text = countries[options[indices[3]]].name)
            }
        }
    }
}
