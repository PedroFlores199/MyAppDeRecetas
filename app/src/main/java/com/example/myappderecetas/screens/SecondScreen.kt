package com.example.myappderecetas.screens

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                InfoReceta()
                TituloComida()
                Ingredientes()
            }
        }
    }
}

@Composable
fun ParallaxSecToolbar(navController: NavController) {

    Row(
        modifier = Modifier
            .statusBarsPadding()
            .padding(top = 10.dp, start = 5.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            painter = painterResource(id = R.drawable.arrowback20px),
            contentDescription = null,
            tint = Grey,
            modifier = Modifier
                .size(50.dp)
                .clickable { navController.popBackStack() }
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
            painter = painterResource(id = R.drawable.favorite20px),
            contentDescription = null,
            tint = Grey,
            modifier = Modifier
                .size(50.dp)
                .clickable { }
            //.padding(top = 20.dp, end = 16.dp)
        )

    }
}

@Composable
fun FotoReceta (){
    Spacer(
        modifier = Modifier
            .height(20.dp)
    )

    Box() {
        Image(
            painter = painterResource(id = R.drawable.ramen_seg_pan),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}



@Composable
fun InfoReceta () {

    Row(modifier = Modifier.padding(20.dp)) {
        Row {
            ConstraintLayout {
                val (tiempo, icono, barra) = createRefs()

                Icon(
                    painter = painterResource(id = R.drawable.time),
                    contentDescription = null,
                    tint = Grey,
                    modifier = Modifier
                        .size(40.dp)
                        .constrainAs(icono) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                        }
                )

                Box(
                    modifier = Modifier
                        .background(Color(color = 0xFF930D0D))
                        .width(5.dp)
                        .height(35.dp)
                        .constrainAs(barra) {
                            start.linkTo(icono.start, margin = 50.dp)
                            end.linkTo(tiempo.start, margin = 10.dp)
                        }

                )
                Text(
                    modifier = Modifier
                        .constrainAs(tiempo) {
                            start.linkTo(barra.start)
                            top.linkTo(barra.top)
                            bottom.linkTo(barra.bottom)
                            end.linkTo(parent.end)

                        },
                    text = "40 min",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                )
            }
        }
        Row {
            ConstraintLayout {
                val (tiempo, icono, barra) = createRefs()

                Icon(
                    painter = painterResource(id = R.drawable.restaurant20px),
                    contentDescription = null,
                    tint = Grey,
                    modifier = Modifier
                        .size(40.dp)
                        .constrainAs(icono) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                        }
                )

                Box(
                    modifier = Modifier
                        .background(Color(color = 0xFF930D0D))
                        .width(5.dp)
                        .height(35.dp)
                        .constrainAs(barra) {
                            start.linkTo(icono.start, margin = 50.dp)
                            end.linkTo(tiempo.start, margin = 10.dp)
                        }

                )
                Text(
                    modifier = Modifier
                        .constrainAs(tiempo) {
                            start.linkTo(barra.start)
                            top.linkTo(barra.top)
                            bottom.linkTo(barra.bottom)
                            end.linkTo(parent.end)

                        },
                    text = "4",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                )
            }
        }
        Row {
            Icon(
                painter = painterResource(id = R.drawable.share20px),
                contentDescription = null,
                tint = Grey,
                modifier = Modifier
                    .size(40.dp)
            )
        }
    }
}

val tituloComidaSem = listOf(
    "Sushi",
    "Cocarris"
)
val subTituloComidaSem = listOf(
    "La cocina tradicional japonesa se fundamenta principalmente en el arroz blanco, al igual que muchos países asiáticos vecinos, por la facilidad para cultivarlo en esas zonas y la versatilidad para usarlo como base o como acompañamiento de muchos platos.",
    "La receta de cocarrois es una delicia originaria de Mallorca y también de Ibiza. Se caracteriza por tener como relleno una mezcla de diversas verduras con condimentos básicos."
)


@Composable
fun TituloComida() {
    Text(
        text = tituloComidaSem[0],
        color = Color.Black,
        style = TextStyle(
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        ),
    )
    Text(
        text = subTituloComidaSem[0],
        color = Color.Black,
        style = TextStyle(
            fontSize = 18.sp
        )
    )
}

val ingredientesSem = listOf("150 gramos de fideos noodles", "2 huevos", "Cebolletas para usar la parte verde", "1 alga nori", "1 litro de caldo de pollo", "6 setas shiitake", "1 pechugas de pollo", "4 dientes de ajo", "80 mililitros de salsa de soja", "2 cucharadas de aceite de oliva", "1 trozo de jengibre" , "30 gramos de mantequilla", "2 cucharaditas de azúcar", "1 cucharadita de sal")

@Composable
fun Ingredientes () {
    Text(
        text = "Ingredientes",
        color = Color.Black,
        style = TextStyle(
            fontSize = 28.sp,
        )
    )
    Spacer(
        modifier = Modifier
            .height(20.dp)
    )
    for (i in 0..2) {
        Text(
            text = ingredientesSem[i],
            color = Color.Black,
            style = TextStyle(
                fontSize = 28.sp,
            )
        )
    }

}



