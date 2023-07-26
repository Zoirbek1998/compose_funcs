package com.example.composefuncs.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composefuncs.ui.theme.Pink40
import com.example.composefuncs.ui.theme.Purple40

@Composable

fun SignUpScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            modifier = Modifier.clickable {
                navController.popBackStack()
            }, text = "SignUp", color = Color.Green, fontSize = 40.sp, fontWeight = FontWeight.Bold)

    }
}
