package com.example.myappderecetas.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myappderecetas.R
import com.example.myappderecetas.navegation.AppScreens
import com.example.myappderecetas.ui.theme.Grey


@Preview
@Composable
fun MyPreview (navController: NavController = rememberNavController()) {
    MainFragment(navController)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FirstScreen (navController: NavController) {
    //Esto es un componente para estrupturar componentes basicos de una pantalla
    Scaffold {
        MainFragment(navController)
    }
}



@Composable
fun MainFragment(navController: NavController ) {

    Background()
    LazyColumn () {
        item {
            ParallaxToolbar(navController)
            PlatoDelDia(navController)
            RecetasDeLaSemana()
        }

    }
}

@Composable
fun Background() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#f7f5f2")))
    )
    {

    }
}

@Composable
fun ParallaxToolbar(navController: NavController) {

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
fun PlatoDelDia (navController: NavController) {

        Box(
            modifier = Modifier
                .padding(top = 30.dp),

            ) {

            Spacer(
                modifier = Modifier.height(440.dp)
            )

            Box(
                modifier = Modifier
                    .background(color = Color.White)
                    .align(Alignment.BottomCenter)
                    .fillMaxSize()
                    .height(360.dp)
                    .clickable { navController.navigate(route = AppScreens.SecondScreen.route) }
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally


                ) {
                    Text(
                        text = "Receta del día",
                        style = TextStyle(
                            color = Color(color = 0xFF930D0D),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold ),
                        modifier = Modifier
                            .padding(top = 70.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
                    )

                    Text(
                        text = "Ramen con udon, shiitakes, huevo y langostinos",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
                    )

                    Text(
                        text = "¡Hoy, la cena japonesa la hacemos en casa! Prepárales un ramen con udon, setas shiitake, huevo, espinacas y langostinos. Haz la lista de la compra con ingredientes orientales para que quede perfecto.",
                        modifier = Modifier
                            .padding(bottom = 20.dp, start = 20.dp, end = 20.dp),
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis

                    )
                    Row (
                        modifier = Modifier
                            .statusBarsPadding()
                            .padding(start = 20.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.time),
                            contentDescription = null,
                            tint = Grey,
                            modifier = Modifier
                                .size(40.dp)
                                .padding(end = 10.dp)
                                .clickable { }
                        )
                        Box(
                            modifier = Modifier
                                .background(Color(color = 0xFF930D0D))
                                .width(5.dp)
                                .height(35.dp)

                        )
                        Text(
                            modifier = Modifier
                                .padding(start = 10.dp),
                            text = "40 min",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                        )
                    }
                }

            }

            Image(
                painter = painterResource(id = R.drawable.ramen_inicio),
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .align(Alignment.TopCenter)
                    .clickable { navController.navigate(route = AppScreens.SecondScreen.route) }
            )

        }

    }


@Composable
fun RecetasDeLaSemana () {
    Spacer(
        modifier = Modifier.height(30.dp)
    )

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Text(
            text = "Recetas de la semana ",
            style = TextStyle(
                color = Color(color = 0xFF930D0D),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            ),

            modifier = Modifier
                .padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
        )
        Text(
            text = "Recetas sencillas y buenas para esta semana",
            style = TextStyle(
                color = Color.Gray,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            ),

            modifier = Modifier
                .padding(bottom = 30.dp, start = 50.dp, end = 40.dp)
        )

    }


}