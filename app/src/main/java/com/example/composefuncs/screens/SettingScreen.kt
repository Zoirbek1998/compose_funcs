package com.example.composefuncs.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composefuncs.ui.theme.Purple40

@Composable

fun SettingScreen(
//    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Red),
        contentAlignment = Alignment.Center
    ) {

        Text(
            modifier = Modifier.clickable {
//                navController.popBackStack()
            }, text = "Settiong", color = Purple40, fontSize = 40.sp, fontWeight = FontWeight.Bold)

    }
}

