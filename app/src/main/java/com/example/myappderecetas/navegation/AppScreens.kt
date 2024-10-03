package com.example.myappderecetas.navegation

//Creamos una clas sellada, nuestra clase recivira por parametro la ruta para indicar a que pantalla queremos ir
sealed class AppScreens(val route: String) {
    object FirstScreen : AppScreens("first_screen")
    object SecondScreen : AppScreens("second_screen")
    object CarruselRecetas : AppScreens("carrusel_recetas") {
        fun createRoute(recipeId: Int) = "$route/$recipeId"
    }
}