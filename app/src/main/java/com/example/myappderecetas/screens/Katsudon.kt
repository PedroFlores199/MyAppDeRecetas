package com.example.myappderecetas.screens

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myappderecetas.R
import com.example.myappderecetas.data.Plato
import com.example.myappderecetas.data.Recetas
import com.example.myappderecetas.ui.theme.Grey
import com.example.myappderecetas.ui.theme.fontFamily
import com.example.myappderecetas.ui.theme.fontFamily2


@Preview
@Composable
fun MyPreviewKatsudon (navController: NavController = rememberNavController()) {
    Katsudon(navController, 1)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Katsudon(navController: NavController, recipeId: Int) {
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