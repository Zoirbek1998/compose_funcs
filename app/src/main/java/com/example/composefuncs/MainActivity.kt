package com.example.composefuncs

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composefuncs.navigation.SetupNavGraph


import com.example.composefuncs.ui.theme.ComposeFuncsTheme


class MainActivity : ComponentActivity() {
    lateinit var navController:NavHostController
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFuncsTheme {

                navController = rememberNavController()
                    SetupNavGraph(navController = navController)

            }
        }
    }
}



