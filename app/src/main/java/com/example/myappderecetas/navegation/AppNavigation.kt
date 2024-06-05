package com.example.myappderecetas.navegation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myappderecetas.screens.FirstScreen
import com.example.myappderecetas.screens.Katsudon
import com.example.myappderecetas.screens.SecondScreen


@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun AppNavigation() {
    //Esta constante se va a encargar de gestionar el estado de navegacion entre las pantallas
    val navController = rememberNavController()
        //Este elemento va aconocer las pantallas y como navegar entre ellas, este nos pedira el navController y la pantalla de inicio
        NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route) {
            composable(route = AppScreens.FirstScreen.route) {
                FirstScreen(navController)
            }
            composable(route = AppScreens.SecondScreen.route) {
                SecondScreen(navController)
            }
            composable(route = AppScreens.Katsudon.route) {
                Katsudon(navController)
            }
    }
}