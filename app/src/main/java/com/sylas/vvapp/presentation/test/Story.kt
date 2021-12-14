package com.sylas.vvapp.presentation.test

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.sylas.vvapp.R

@Composable
fun Story() {
    Column(Modifier.padding(horizontal = 8.dp)) {
        Image(
            modifier = Modifier
                .size(85.dp)
                .background(Color("#FBFBFB".toColorInt()), CircleShape),
            painter = painterResource(id = R.drawable.ic_magazine),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            "Вы ведете здоровый образ жизни?",
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight(500),
            color = Color("#FBFAF9".toColorInt()),
            modifier = Modifier
                .width(85.dp)
                .alpha(0.7f)

        )
    }
}


@Preview
@Composable
fun prev() {
    Story()
}