package com.korugan.flagquiz.Components

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
import com.korugan.flagquiz.countries
import com.korugan.flagquiz.screenWidth
import com.korugan.flagquiz.ui.theme.LightGreen
import kotlin.random.Random

var FlagNumber = 0

@Composable
fun Buttons(
    correctCount: MutableState<Int>,
    incorrectCount: MutableState<Int>,
    isCorrect: MutableState<Boolean>,
    status: MutableState<Boolean>
) {
    val options = array()
    val indices = RandomIndexGenerator()

    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Button(
                onClick = {
                    CheckAnswer(
                        indices[0],
                        correctCount,
                        incorrectCount,
                        isCorrect,
                        status
                    )
                },
                modifier = Modifier.width(screenWidth() * 0.7.dp),
                colors = ButtonDefaults.buttonColors(LightGreen)
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
                    CheckAnswer(
                        indices[1],
                        correctCount,
                        incorrectCount,
                        isCorrect,
                        status
                    )
                },
                modifier = Modifier.width(screenWidth() * 0.7.dp),
                colors = ButtonDefaults.buttonColors(LightGreen)
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
                    CheckAnswer(
                        indices[2],
                        correctCount,
                        incorrectCount,
                        isCorrect,
                        status
                    )
                },
                modifier = Modifier.width(screenWidth() * 0.7.dp),
                colors = ButtonDefaults.buttonColors(LightGreen)
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
                    CheckAnswer(
                        indices[3],
                        correctCount,
                        incorrectCount,
                        isCorrect,
                        status
                    )
                },
                modifier = Modifier.width(screenWidth() * 0.7.dp),
                colors = ButtonDefaults.buttonColors(LightGreen)
            ) {
                Text(text = countries[options[indices[3]]].name)
            }
        }
    }
}

fun array(): ArrayList<Int> {
    val array = ArrayList<Int>()
    array.add(FlagNumber)
    var CountryNumber2: Int
    val r = 0..243
    for (i in 1..3) {
        do {
            CountryNumber2 = Random.nextInt(r.first, r.last + 1)
        } while (array.contains(CountryNumber2))
        array.add(CountryNumber2)
    }
    return array
}

fun RandomIndexGenerator(): ArrayList<Int> {
    val randomIndex = ArrayList<Int>()
    var index: Int
    for (i in 1..4) {
        do {
            index = Random.nextInt(0, 4)
        } while (randomIndex.contains(index))
        randomIndex.add(index)
    }
    return randomIndex
}

fun CheckAnswer(
    clickedIndex: Int,
    correctCount: MutableState<Int>,
    incorrectCount: MutableState<Int>,
    isCorrect: MutableState<Boolean>,
    status: MutableState<Boolean>
) {
    val options = array()
    if (FlagNumber == options[clickedIndex]) {
        correctCount.value += 1
        isCorrect.value = true
    } else {
        incorrectCount.value += 1
        isCorrect.value = false
    }
    status.value = false
    FlagNumber += 1
}