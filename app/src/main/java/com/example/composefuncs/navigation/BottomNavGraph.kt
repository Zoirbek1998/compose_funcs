package com.example.composefuncs.navigation

import androidx.compose.runtime.Composable


import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.composefuncs.BottomBarScreen
import com.example.composefuncs.screens.HomeScreen
import com.example.composefuncs.screens.ProfileScreen
import com.example.composefuncs.screens.SettingScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(
            route = BottomBarScreen.Home.route
        ) {
            HomeScreen()
        }
        composable(
            route = BottomBarScreen.Profile.route
        ) {
            ProfileScreen()
        }
        composable(
            route = BottomBarScreen.Setting.route
        ) {
            SettingScreen()
        }
    }

}