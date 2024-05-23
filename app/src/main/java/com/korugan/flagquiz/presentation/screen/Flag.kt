package com.korugan.flagquiz.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import coil.compose.rememberAsyncImagePainter
import com.korugan.flagquiz.R
import com.korugan.flagquiz.presentation.screen.main.screenHeight
import com.korugan.flagquiz.util.Country.Companion.countries
import com.korugan.flagquiz.util.array


@Composable
fun Flag(correctCount: MutableState<Int>, incorrectCount: MutableState<Int>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(screenHeight() * 0.17.dp)
            .padding(screenHeight() * 0.03.dp)
            .offset(y = screenHeight() * 0.02.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(text = "${correctCount.value} Correct", color = Color.Green,)
        Text(text = "${incorrectCount.value} Incorrect", color = Color.Red,)
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(screenHeight() * 0.3.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = rememberAsyncImagePainter(model = "https://flagcdn.com/h240/${countries[array()[0]].code.lowercase()}.png"),
            contentDescription = stringResource(id = R.string.content_description_flag),
            modifier = Modifier
                .size(screenHeight() * 0.3.dp),
        )
    }
}