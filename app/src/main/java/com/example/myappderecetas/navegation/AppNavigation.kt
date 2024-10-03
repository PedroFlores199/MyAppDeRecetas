package com.example.myappderecetas.navegation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myappderecetas.screens.CarruselRecetas
import com.example.myappderecetas.screens.FirstScreen
import com.example.myappderecetas.screens.Gyozas
import com.example.myappderecetas.screens.TartaQueso


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
            //Esto es para la imagen del primer componente de la aplicacion
            composable(route = AppScreens.SecondScreen.route) {
                Gyozas(navController)
            }
            //Esto es para navegar entre las pantallas del carrusel y que al clickearle salga la receta correcta
            composable(
                route = "${AppScreens.CarruselRecetas.route}/{recipeId}",
                arguments = listOf(navArgument("recipeId") { type = NavType.IntType })
            ) { backStackEntry ->
                val recipeId = backStackEntry.arguments?.getInt("recipeId") ?: 0
                CarruselRecetas(navController, recipeId)
            }
    }
}