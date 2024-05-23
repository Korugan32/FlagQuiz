package com.korugan.flagquiz.util

import androidx.compose.runtime.MutableState
import kotlin.random.Random

var flagNumber = 0

fun array(): ArrayList<Int> {
    var countryNumber: Int
    val array = ArrayList<Int>()

    array.add(flagNumber)

    for (i in 1..3) {
        do {
            countryNumber = Random.nextInt(0, 244)
        } while (array.contains(countryNumber))
        array.add(countryNumber)
    }
    return array
}

fun randomIndexGenerator(): ArrayList<Int> {
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

fun checkAnswer(
    clickedIndex: Int,
    correctCount: MutableState<Int>,
    incorrectCount: MutableState<Int>,
    isCorrect: MutableState<Boolean>,
    status: MutableState<Boolean>
) {
    val options = array()

    if (flagNumber == options[clickedIndex]) {
        correctCount.value += 1
        isCorrect.value = true
    } else {
        incorrectCount.value += 1
        isCorrect.value = false
    }
    status.value = false
    flagNumber += 1
}