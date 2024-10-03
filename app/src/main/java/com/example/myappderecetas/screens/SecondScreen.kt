package com.example.myappderecetas.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Preview
@Composable
fun MyPreviewKatsudon (navController: NavController = rememberNavController()) {
    CarruselRecetas(navController, 1)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CarruselRecetas(navController: NavController, recipeId: Int) {
    Scaffold {
        FragmentoKatsudon(navController, recipeId)
    }
}

@Composable
fun FragmentoKatsudon(navController: NavController, recipeId: Int) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#f7f5f2")))
    ) {
        LazyColumn {
            item {
                FotoReceta(recipeId)
                TituloComida(recipeId)
                Ingredientes(recipeId)
                Preparacion(recipeId)
            }
        }
    }
}