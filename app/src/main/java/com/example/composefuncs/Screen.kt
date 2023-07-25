package com.example.composefuncs

const val DETAIL_ARGUMENTS_KEY = "id"
sealed class Screen(val route: String){
    object Home:Screen(route = "home_screen")
    object Detail:Screen(route = "detaile_screen/{$DETAIL_ARGUMENTS_KEY}"){
        fun passId(id:Int):String{
            return "detaile_screen/$id"
        }
    }
}
