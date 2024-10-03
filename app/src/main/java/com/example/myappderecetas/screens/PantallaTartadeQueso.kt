package com.example.myappderecetas.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myappderecetas.R
import com.example.myappderecetas.ui.theme.fontFamily
import com.example.myappderecetas.ui.theme.fontFamily2


@Preview
@Composable
fun MyPreviewQueso (navController: NavController = rememberNavController()) {
    TartaQueso(navController)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TartaQueso (navController: NavController) {
    Scaffold{
        FragmentoSegundario(navController)
    }
}

@Composable
fun FragmentoSeguntdario (navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#f7f5f2")))
    ) {
        LazyColumn {
            item {
                //ParallaxSecToolbar(navController)
                FotoReceta(6)
                InfoReceta(6)
                TituloComida(6)
                IngredientesTartaQueso(6)
                Preparacion(6)
            }
        }
    }
}