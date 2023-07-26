package com.example.composefuncs.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composefuncs.navigation.AUTHENTICATION_ROUTE
import com.example.composefuncs.navigation.Screen
import com.example.composefuncs.ui.theme.Pink40

@Composable
fun HomeScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Detail.passId(5))
            }, text = "Home", color = Pink40, fontSize = 40.sp, fontWeight = FontWeight.Bold
        )
        Text(text = "Login/SignUp", modifier = Modifier
            .padding(top = 150.dp)
            .clickable {
                navController.navigate(AUTHENTICATION_ROUTE)
            })

    }
}

