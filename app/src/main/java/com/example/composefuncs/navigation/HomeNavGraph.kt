package com.example.composefuncs.navigation

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import com.example.composefuncs.screens.DetailScreen
import com.example.composefuncs.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(navController: NavHostController) {

    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE,
    ){
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument("id") {
                type = NavType.IntType
            })
        ) {
            Log.d("Args", "SetupNavGraph: ${it.arguments?.getInt("id")}")
            DetailScreen(navController = navController)
        }
    }

}