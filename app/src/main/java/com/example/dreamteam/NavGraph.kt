package com.example.dreamteam

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME_SCREEN
    ) {
        composable(Routes.HOME_SCREEN) {
            HomeScreen(navController)
        }

        composable(Routes.PENAFIEL_SCREEN) {
            PenafielProfile(navController)
        }

        composable(Routes.QUITORIO_SCREEN) {
            QuitorioProfile(navController)
        }

        composable(Routes.RABANO_SCREEN) {
            RabanoProfile(navController)
        }

        composable(Routes.RECION_SCREEN) {
            RecioProfile(navController)
        }

        composable(Routes.ROSALES_SCREEN) {
            RosalesProfile(navController)
        }
    }
}