package com.example.composefuncs.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composefuncs.navigation.AUTHENTICATION_ROUTE
import com.example.composefuncs.navigation.HOME_ROUTE
import com.example.composefuncs.navigation.Screen
import com.example.composefuncs.ui.theme.Pink40
import com.example.composefuncs.ui.theme.Purple40

@Composable

fun LoginScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.SignUp.route)
            }, text = "Login", color = Color.Magenta, fontSize = 40.sp, fontWeight = FontWeight.Bold
        )
        Text(text = "Open Detail Screen", modifier = Modifier
            .padding(top = 150.dp)
            .clickable {
                // graph ga o'tish
//                navController.navigate(HOME_ROUTE){
//                    popUpTo(HOME_ROUTE)
//                }

//                screen ga o'tish'
                navController.navigate(Screen.Detail.passId(8))
            })
    }
}

