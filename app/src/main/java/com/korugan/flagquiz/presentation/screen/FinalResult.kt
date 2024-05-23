package com.korugan.flagquiz.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import com.korugan.flagquiz.R
import com.korugan.flagquiz.presentation.screen.main.screenHeight
import com.korugan.flagquiz.presentation.screen.main.screenWidth
import com.korugan.flagquiz.presentation.theme.DarkGreen

@Composable
fun FinalResult(
    correctCount: MutableState<Int>,
    incorrectCount: MutableState<Int>,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .alpha(0.45f),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .background(color = Color.White, shape = RoundedCornerShape(40.dp))
                .height(screenHeight() * 0.3.dp)
                .width(screenHeight() * 0.4.dp)
                .padding(20.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            Box(
                modifier = Modifier
                    .height(screenHeight() * 0.03.dp)
                    .width(screenWidth().dp),
            ) {
                Text(text = "Your Results:", fontWeight = FontWeight.Bold, fontSize = 20.sp)

                Text(
                    text = "Correct Answers: ${correctCount.value}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.offset(y = 90.dp),
                    color = DarkGreen,
                )

                Text(
                    text = "Your Results: ${incorrectCount.value}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.offset(y = 180.dp),
                    color = Color.Red,
                )
            }
        }

        Row(
            modifier = Modifier
                .background(color = Color.White, shape = RoundedCornerShape(40.dp))
                .height(screenHeight() * 0.08.dp)
                .width(screenHeight() * 0.4.dp)
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(text = "Play Again", fontWeight = FontWeight.Bold, fontSize = 20.sp)

            IconButton(
                onClick = {
                    restart(
                        incorrectCount = incorrectCount,
                        correctCount = correctCount,
                    )
                },
            ) {
                Icon(
                    Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = stringResource(id = R.string.content_description_continue),
                    modifier = Modifier
                        .size(screenHeight() * 0.3.dp),
                )
            }
        }
    }
}

private fun restart(incorrectCount: MutableState<Int>, correctCount: MutableState<Int>) {
    correctCount.value = 0
    incorrectCount.value = 0
}