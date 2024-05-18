package com.example.myappderecetas.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Preview
@Composable
fun MyPreviewReceta (navController: NavController = rememberNavController()) {
    SecondBodyContent(navController)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SecondScreen (navController: NavController) {
    Scaffold {
        SecondBodyContent(navController)
    }
}


@Composable
fun SecondBodyContent (navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("He navegado")

        //Aqui con el metodo popBackStack() volvemos a la pantalla anterior
        Button(onClick = { navController.popBackStack() }) {
            Text("Vover Atras")
        }
    }
}