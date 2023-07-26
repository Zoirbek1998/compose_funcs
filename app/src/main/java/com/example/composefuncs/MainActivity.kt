package com.example.composefuncs

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.composefuncs.screens.MainScreen


import com.example.composefuncs.ui.theme.ComposeFuncsTheme


class MainActivity : ComponentActivity() {
    @ExperimentalMaterial3Api
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFuncsTheme {

               MainScreen()

            }
        }
    }
}



