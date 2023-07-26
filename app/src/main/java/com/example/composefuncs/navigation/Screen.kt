package com.example.composefuncs.navigation

const val DETAIL_ARGUMENTS_KEY = "id"

const val AUTHENTICATION_ROUTE ="authentication"
const val HOME_ROUTE ="home_route"
const val ROOT_ROUTE ="root_route"
sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detaile_screen/{$DETAIL_ARGUMENTS_KEY}"){
        fun passId(id:Int):String{
            return "detaile_screen/$id"
        }
    }
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "signup_screen")
}
