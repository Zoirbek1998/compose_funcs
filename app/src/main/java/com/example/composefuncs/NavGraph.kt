package com.example.composefuncs

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation


@Composable

fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route){
            HomeScreen(navController=navController)
        }

        composable(route = Screen.Detail.route,
        arguments = listOf(navArgument("id"){
            type = NavType.IntType
        })
        ){
            Log.d("Args", "SetupNavGraph: ${it.arguments?.getInt("id")}")
            DetailScreen(navController=navController)
        }
    }
}