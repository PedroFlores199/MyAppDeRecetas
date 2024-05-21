package com.example.myappderecetas.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myappderecetas.R
import com.example.myappderecetas.ui.theme.Grey


@Preview
@Composable
fun MyPreviewReceta (navController: NavController = rememberNavController()) {
    SecondScreen(navController)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SecondScreen (navController: NavController) {
    Scaffold{
        FragmentoSegundario(navController)
    }
}

@Composable
fun FragmentoSegundario (navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#f7f5f2")))
    ) {
        LazyColumn {
            item {
                ParallaxSecToolbar(navController)
                FotoReceta()
            }
        }
    }
}

@Composable
fun ParallaxSecToolbar(navController: NavController) {

    Row(
        modifier = Modifier
            .statusBarsPadding()
            .padding(top = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            painter = painterResource(id = R.drawable.menu20px),
            contentDescription = null,
            tint = Grey,
            modifier = Modifier
                .size(50.dp)
                .clickable { }
            //.padding(top = 20.dp, end = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.icono_menu),
            contentDescription = null,
            modifier = Modifier
                .height(60.dp)
                .clickable { }
        )

        Icon(
            painter = painterResource(id = R.drawable.search20px),
            contentDescription = null,
            tint = Grey,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .clickable { }
            //.padding(top = 20.dp, end = 16.dp)
        )

    }
}

@Composable
fun FotoReceta (){
    Box() {
        Image(
            painter = painterResource(id = R.drawable.ramen_seg_pan),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}




/*
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
 */
