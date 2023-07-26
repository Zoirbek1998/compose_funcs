package com.example.composefuncs.navigation

sealed class Screen(
    val route:String
){
    object Splash:Screen("splash-screen")
    object Home:Screen("home-screen")
}
