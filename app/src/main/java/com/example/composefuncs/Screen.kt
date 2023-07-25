package com.example.composefuncs

sealed class Screen(val route: String){
    object Home:Screen(route = "home_screen")
    object Detail:Screen(route = "detaile_screen")
}
