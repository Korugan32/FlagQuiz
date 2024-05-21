package com.korugan.flagquiz.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import com.korugan.flagquiz.countries
import com.korugan.flagquiz.screenHeight

@Composable
fun Result(
    isCorrect: MutableState<Boolean>,
    status: MutableState<Boolean>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(screenHeight() * 0.3.dp)
            .alpha(0.3f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .background(color = Color.White, shape = RoundedCornerShape(40.dp))
                .height(screenHeight() * 0.08.dp)
                .width(screenHeight() * 0.4.dp)
                .padding(20.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            if (isCorrect.value) {
                Text(
                    text = "Well Done",
                    fontSize = 25.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                IconButton(onClick = { status.value = !status.value }) {
                    Icon(
                        Icons.Filled.KeyboardArrowRight,
                        contentDescription = "",
                        modifier = Modifier
                            .height(
                                screenHeight() * 0.4.dp
                            )
                            .width(screenHeight() * 0.4.dp)
                    )
                }

            } else {
                Text(
                    text = "Wrong, it is ${countries[FlagNumber - 1].name}",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(screenHeight() * 0.08.dp),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.End
                ) {
                    IconButton(onClick = { status.value = !status.value }) {
                        Icon(
                            Icons.Filled.KeyboardArrowRight,
                            contentDescription = "",
                            modifier = Modifier
                                .height(
                                    screenHeight() * 0.4.dp
                                )
                                .width(screenHeight() * 0.4.dp)
                        )
                    }
                }
            }
        }
    }

}
