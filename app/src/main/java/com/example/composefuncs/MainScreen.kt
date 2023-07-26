package com.example.composefuncs

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Image(
        modifier = Modifier
            .size(300.dp)
            .clip(CircleShape)
            .border(width = 10.dp, color = Color.Red, shape = CircleShape),
        painter = painterResource(id = R.drawable.image),
        contentDescription = null
    )
//    CircleShape -> bu dumoloq qilib beradi
//    RoundedCornerShape(size = 50.dp) -> bu esa shakil berishimiz mumkin
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreen()
}