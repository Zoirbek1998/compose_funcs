package com.example.composefuncs.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.composefuncs.screens.DetailScreen
import com.example.composefuncs.screens.HomeScreen
import com.example.composefuncs.screens.LoginScreen
import com.example.composefuncs.screens.SignUpScreen


@Composable

fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {

        homeNavGraph(navController = navController)

        //new graph
        authNavGraph(navController = navController)


    }
}