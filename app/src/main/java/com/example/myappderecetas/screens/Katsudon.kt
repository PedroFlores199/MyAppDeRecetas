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
import com.example.myappderecetas.ui.theme.Grey
import com.example.myappderecetas.ui.theme.fontFamily
import com.example.myappderecetas.ui.theme.fontFamily2


@Preview
@Composable
fun MyPreviewKatsudon (navController: NavController = rememberNavController()) {
    Katsudon(navController)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Katsudon (navController: NavController) {
    Scaffold{
        FragmentoKatsudon(navController)
    }
}


@Composable
fun FragmentoKatsudon (navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#f7f5f2")))
    ) {
        LazyColumn {
            item {
                ParallaxSecToolbar(navController)
                FotoReceta(katsudon)
                TituloComida(katsudonTitulo, descripcionKatsudon)
                IngredientesKatsudon()
                PreparacionKatsudon ()
            }
        }
    }
}



val descripcionKatsudon = listOf("El katsudon es un plato japonés popular que consiste en tonkatsu (cerdo empanizado y frito) y huevos cocidos en un caldo dulce y salado servido sobre arroz. ", "Katsu, o \"chuleta\" en japonés, se refiere a la carne que se machaca finamente antes de cocinarla. Don , o donburi , lo identifica como un plato de tazón.")
val ingredientesKatsudon = listOf("2 chuletas de cerdo deshuesadas y cortadas en el centro , machacadas hasta 1 centímetro de grosor", "Sal al gusto", "Pimienta negra recién molida , al gusto", "Harina para todo uso , para espolvorear", "5 huevos grandes , batidos, divididos", "1 taza de panko", "Aceite para freír", "Aceite para freír", "1 1/4 tazas de caldo de sopa dashi", "1/3 taza de salsa de soja", "2 cucharadas de mirín", "1 cucharada de azúcar", "1 cebolla mediana , en rodajas finas", "4 tazas de arroz japonés al vapor")
val preparacionKatsudon = listOf("Reúne los ingredientes",
        "Sazone las chuletas de cerdo machacadas con sal y pimienta",
        "Espolvoree con una capa ligera y uniforme de harina",
        "En un tazón poco profundo, bata 1 de los huevos. Pon el panko en otro recipiente poco profundo",
        "Agregue una capa fina y uniforme de aceite a una sartén o sartén de hierro fundido a fuego medio. El aceite estará listo cuando le eches pan rallado panko y chisporrotee",
        "Sumerja la carne de cerdo espolvoreada con harina en el huevo para cubrir ambos lados",
        "Transfiera la carne de cerdo al panko y presiónela uniformemente contra la carne para obtener una buena cobertura",
        "Coloque con cuidado las chuletas de cerdo en el aceite caliente y cocine de 5 a 6 minutos por un lado, hasta que estén doradas",
        "Voltee y cocine el otro lado durante otros 5 a 6 minutos, o hasta que esté dorado, crujiente y bien cocido",
        "Escurrir en un plato forrado con una toalla de papel",
        "Corta tu tonkatsu en pedazos",
        "Pon el caldo de sopa dashi en una sartén y caliéntalo a fuego medio",
        "Agrega la salsa de soja, el mirin y el azúcar a la sopa y deja hervir",
        "Para cocinar 1 porción de katsudon, ponga 1/4 de la sopa y 1/4 de la cebolla rebanada en una sartén pequeña. Cocine a fuego lento durante unos minutos a fuego medio.",
        "Agregue 1 porción de trozos de tonkatsu (la mitad de 1 chuleta de cerdo) a la sartén y cocine a fuego lento durante unos minutos",
    "Batir otro de los huevos en un bol. Lleva la sopa a ebullición y vierte el huevo sobre el tonkatsu y la cebolla",
    "Baje el fuego al mínimo y cubra con una tapa. Cocine hasta que el huevo haya cuajado y retírelo del fuego. El huevo debe estar bien cocido",
    "Sirva colocando 1 porción de arroz al vapor en un tazón de arroz grande. Cubra con el tonkatsu cocido a fuego lento encima del arroz. Repita para hacer 3 porciones más")
val imagenesPeparacionKatsudon= listOf(R.drawable.paso1_katsudon, R.drawable.paso2_katsudon, R.drawable.paso3_katsudon, R.drawable.paso4_katsudon, R.drawable.paso5_katsudon, R.drawable.paso6_katsudon, R.drawable.paso7_katsudon, R.drawable.paso8_katsudon, R.drawable.paso9_katsudon, R.drawable.paso10_katsudon, R.drawable.paso11_katsudon, R.drawable.paso12_katsudon, R.drawable.paso13_katsudon, R.drawable.paso14_katsudon, R.drawable.paso15_katsudon, R.drawable.paso16_katsudon, R.drawable.paso17_katsudon, R.drawable.paso18_katsudon)
val katsudon = R.drawable.katsudon_titulo
val katsudonTitulo = "Katsudon"


@Composable
fun IngredientesKatsudon () {

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

    for (i in 0 until ingredientesKatsudon.size) {
        Text(
            text = ingredientesKatsudon[i],
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

@Composable
fun PreparacionKatsudon () {
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
            for (i in 0 until preparacionKatsudon.size) {
                Column(
                    modifier = Modifier
                        .fillMaxSize() // Fills the entire parent container
                        .padding(horizontal = 20.dp, vertical = 10.dp) // Consistent padding
                ) {
                    Row( // Arrange text and image horizontally
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Image(
                            painter = painterResource(id = imagenesPeparacionKatsudon[i]),
                            contentDescription = null,
                            modifier = Modifier
                                .weight(1f) // Occupies half the available width
                                .padding(top = 3.dp, bottom = 50.dp) // Consistent padding
                        )
                        Spacer(modifier = Modifier.weight(0.1f)) // Adds a small space between elements
                        Text(
                            text = preparacionKatsudon[i],
                            fontFamily = fontFamily2,
                            color = Color.Black,
                            style = TextStyle(fontSize = 20.sp),
                            modifier = Modifier
                                .weight(1f) // Occupies half the available width
                                .padding(top = 3.dp, bottom = 10.dp)
                        )
                    }
                }
            }
        }
        Configuration.ORIENTATION_PORTRAIT -> {
            for (i in 0 until preparacionKatsudon.size) {
                Text(
                    text = preparacionKatsudon[i],
                    fontFamily = fontFamily2,
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 20.sp
                    ),
                    modifier = Modifier
                        .padding(top = 3.dp, bottom = 10.dp, start = 20.dp, end = 10.dp)
                )
                Image(
                    painter = painterResource(id = imagenesPeparacionKatsudon[i]),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 3.dp, bottom = 50.dp, start = 20.dp, end = 10.dp),

                    )
            }
        }
    }
}