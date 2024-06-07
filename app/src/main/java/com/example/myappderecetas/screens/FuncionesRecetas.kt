package com.example.myappderecetas.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myappderecetas.data.Recetas
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



