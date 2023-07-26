package com.example.composefuncs

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


import com.example.composefuncs.ui.theme.ComposeFuncsTheme


class MainActivity : ComponentActivity() {
    @ExperimentalMaterial3Api
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFuncsTheme {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    MainScreen()
                }

            }
        }
    }
}



