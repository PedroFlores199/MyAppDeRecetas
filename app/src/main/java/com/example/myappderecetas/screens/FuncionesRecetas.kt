package com.example.myappderecetas.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.myappderecetas.R
import com.example.myappderecetas.data.Recetas
import com.example.myappderecetas.ui.theme.Grey
import com.example.myappderecetas.ui.theme.fontFamily
import com.example.myappderecetas.ui.theme.fontFamily2

@Composable
fun Ingredientes (platoId: Int) {
    val plato = Recetas.RecetasList.find { it.id == platoId }

    Text(
        text = ("Ingredientes"),
        fontFamily = fontFamily,
        color = Color.Black,
        style = TextStyle(
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
        ),
        modifier = Modifier
            .padding(top = 10.dp, bottom = 10.dp, start = 20.dp, end = 20.dp)
    )

    if (plato != null) {
        for (ingrediente in plato.ingredientes) {
            Text(
                text = ingrediente,
                fontFamily = fontFamily2,
                color = Color.Black,
                style = TextStyle(
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .padding(top = 3.dp, bottom = 3.dp, start = 20.dp, end = 10.dp)
            )
        }
    }
}

@Composable
fun Preparacion (platoId: Int) {
    val plato = Recetas.RecetasList.find { it.id == platoId }

    Text(
        text = ("Preparacion"),
        fontFamily = fontFamily,
        color = Color.Black,
        style = TextStyle(
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
        ),
        modifier = Modifier
            .padding(top = 10.dp, bottom = 10.dp, start = 20.dp, end = 20.dp)
    )

    val configuracion = LocalConfiguration.current
    when (configuracion.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            plato?.let {
                it.pasosPreparacion.forEachIndexed { index, preparacion ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 20.dp, vertical = 10.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Image(
                                painter = painterResource(id = it.imagenesPreparacion[index]),
                                contentDescription = null,
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(top = 3.dp, bottom = 50.dp)
                            )
                            Spacer(modifier = Modifier.weight(0.1f))
                            Text(
                                text = preparacion,
                                fontFamily = fontFamily2,
                                color = Color.Black,
                                style = TextStyle(fontSize = 20.sp),
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(top = 3.dp, bottom = 10.dp)
                            )
                        }
                    }
                }
            }
        }
        Configuration.ORIENTATION_PORTRAIT -> {
            plato?.let {
                it.pasosPreparacion.forEachIndexed { index, preparacion ->
                    Text(
                        text = preparacion,
                        fontFamily = fontFamily2,
                        color = Color.Black,
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                            .padding(top = 3.dp, bottom = 10.dp, start = 20.dp, end = 10.dp)
                    )
                    Image(
                        painter = painterResource(id = it.imagenesPreparacion[index]),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 3.dp, bottom = 50.dp, start = 20.dp, end = 10.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun TituloComida(platoId: Int) {
    val plato = Recetas.RecetasList.find { it.id == platoId }
    plato?.let { recipe ->

        Text(
            text = recipe.nombre,
            fontFamily = fontFamily,
            color = Color.Black,
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
            ),
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp, start = 20.dp, end = 10.dp)
        )


        recipe.descripcion.forEach { descripcion ->
                Text(
                    text = descripcion + "\n",
                    fontFamily = fontFamily2,
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 18.sp
                    ),
                    modifier = Modifier
                        .padding(top = 3.dp, bottom = 2.dp, start = 20.dp, end = 10.dp)
                )
            }
        }
    }

@Composable
fun FotoReceta (platoId : Int){
    val plato = Recetas.RecetasList.find { it.id == platoId }
    plato?.let { recipe ->
        Box {
            Image(
                painter = painterResource(id = recipe.imagen), // Assuming `imagen` is the resource ID for the main image
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
                )
        }
    }
}

@Composable
fun InfoReceta (platoId : Int) {
    val plato = Recetas.RecetasList.find { it.id == platoId }
    plato?.let { recipe ->

        Box(modifier = Modifier.padding(20.dp)) {
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
                        text = recipe.tiempo,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier
                            .constrainAs(tiempo) {
                                start.linkTo(barra.start)
                                top.linkTo(barra.top)
                                bottom.linkTo(barra.bottom)
                                end.linkTo(parent.end)

                            }
                    )
                }
            }

            Row(modifier = Modifier.align(Alignment.BottomCenter)) {
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
                                start.linkTo(parent.start, margin = 150.dp)
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
                        text = recipe.personas.toString(),
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                    )
                }
            }

            Row {
                ConstraintLayout {
                    val (compartir) = createRefs()
                    Icon(
                        painter = painterResource(id = R.drawable.share20px),
                        contentDescription = null,
                        tint = Grey,
                        modifier = Modifier
                            .size(40.dp)
                            .constrainAs(compartir) {
                                top.linkTo(parent.top)
                                start.linkTo(parent.start, 300.dp)
                                end.linkTo(parent.end)
                            }
                    )
                }
            }
        }
    }
}
@Composable
fun IngredientesGyozas (platoId : Int) {
    val plato = Recetas.RecetasList.find { it.id == platoId }
    plato?.let { recipe ->
        // Separate ingredients into masa, relleno, and salsa
        val masaGyozas = recipe.ingredientes.subList(0, 3)
        val rellenoDeGyozas = recipe.ingredientes.subList(4, 14)
        val salsaGyozas = recipe.ingredientes.subList(15, recipe.ingredientes.size)
        Column {
            Text(
                text = "Ingredientes",
                fontFamily = fontFamily,
                color = Color.Black,
                style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp, start = 20.dp, end = 20.dp)
            )

            // Masa de Gyozas
            Text(
                text = "Para la masa de Gyozas",
                fontFamily = fontFamily,
                color = Color.Black,
                style = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp, start = 20.dp, end = 20.dp)
            )

            for (ingrediente in masaGyozas) {
                Text(
                    text = ingrediente,
                    fontFamily = fontFamily2,
                    color = Color.Black,
                    style = TextStyle(fontSize = 18.sp),
                    modifier = Modifier
                        .padding(top = 3.dp, bottom = 3.dp, start = 20.dp, end = 10.dp)
                )
            }

            // Relleno de Gyozas
            Text(
                text = "Para el relleno de gyozas",
                fontFamily = fontFamily,
                color = Color.Black,
                style = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
            )

            for (ingrediente in rellenoDeGyozas) {
                Text(
                    text = ingrediente,
                    fontFamily = fontFamily2,
                    color = Color.Black,
                    style = TextStyle(fontSize = 18.sp),
                    modifier = Modifier
                        .padding(top = 4.dp, bottom = 3.dp, start = 20.dp, end = 10.dp)
                )
            }

            // Salsa de Gyozas
            Text(
                text = "Para la salsa de Gyozas",
                fontFamily = fontFamily,
                color = Color.Black,
                style = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
            )

            for (ingrediente in salsaGyozas) {
                Text(
                    text = ingrediente,
                    fontFamily = fontFamily2,
                    color = Color.Black,
                    style = TextStyle(fontSize = 18.sp),
                    modifier = Modifier
                        .padding(top = 3.dp, bottom = 3.dp, start = 20.dp, end = 10.dp)
                )
            }
        }
    }
}

