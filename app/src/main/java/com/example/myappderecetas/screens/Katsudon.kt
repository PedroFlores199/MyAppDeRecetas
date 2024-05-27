package com.example.myappderecetas.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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

            }
        }
    }
}



val descripcionKatsudon = listOf("El katsudon es un plato japonés popular que consiste en tonkatsu (cerdo empanizado y frito) y huevos cocidos en un caldo dulce y salado servido sobre arroz. ", "Katsu, o \"chuleta\" en japonés, se refiere a la carne que se machaca finamente antes de cocinarla. Don , o donburi , lo identifica como un plato de tazón.")
val masaKatsudon = listOf("310 g de harina", "155 ml de agua", "Una pizca de sal")
val rellenoDeKatsudons = listOf ("375 g de carne picada de cerdo", "1,50 cm de jengible", "1/4 de cucharada (chuchara grande) de vino de arroz o de vino blanco", "1/8 de repollo", "1/2 de diente de ajo", "3 ajetes", "1/2 cucharada de salsa de soja", "3 granos de pimienta blanca", "1 pizca de sal", "1/2 cucharadilla de azúcar" )
val salsaKatsudon = listOf("37,5 ml de salsa de soja ", "12,5 ml de vinagre de arroz ", "Un poquito de sesamo")
val preparacionPanko = listOf("En un bol añade la harina de trigo y la sal. ",
    "Llevamos a ebullición el agua y en cuanto empiece a hervir, lo echamos en el bol y mezclamos bien",
    "Transfiere la masa a una superficie y amasa de 7 a 8 minutos, o hasta que sea elástica y lisa",
    "Cubre la masa con un trapo húmedo y déjala reposar una hora a temperatura ambiente",
    "Pon uno de los trozos con el lado del corte mirando hacia arriba y aplástalo con la palma de la mano",
    "Corta un churro en 16 trozos de igual tamaño.",
    "Pon uno de los trozos con el lado del corte mirando hacia arriba, y aplástalo con la palma de la mano",
    "Con un rodillo, estira la masa desde fuera hacia adentro, girando el disco poco a poco, dándole forma circular y dejando el centro más grueso que el borde", "Lo estiramos un poco con la mano y ya estaría hecha la masa, lista para poner el relleno dentro")
val preparacionKatsudon = listOf("Quítale el corazón al repollo y córtalo en trozos grandes",
        "Mételo en un cazo con agua hirviendo. Hiérvelo durante 10 minutos",
        "Pica los ajetes, pela el jengibre y los ajos",
        "Pon el repollo debajo de agua fría para parar la cocción",
        "Pícalo muy fino y después estrújalo para extraer toda el agua posible",
        "En un bol, añade la carne picada, el vino de arroz, el azúcar, la salsa de soja, la sal, los ajetes, el jengibre rallado, el ajo rallado, el repollo, el glutamato monosódico y la pimienta blanca" +
        "Mezcla con la mano, siempre girando en la misma dirección, hasta que se adhiera a las paredes y sea pastoso",
        "Prueba y corrige sazonado. Resérvalo en la nevera cubierto con papel film",
        "Coge la masa y pon una cucharadilla de relleno en el centro",
        "Humedece la mitad del borde ligeramente con agua, y después cierra la gyoza, haciendo el patrón que más te guste. Repite con toda la masa",
        "En un bol pequeño, mezcla la salsa de soja, el vinagre de arroz y el sésamo. Resérvalo.",
        "Calienta una sartén antiadherente sobre fuego medio, añade un poco de aceite de girasol y coloca las gyozas. Déjalas tostarse 2 minutos, hasta que estén doradas por debajo",
        "Añade agua fría a la sartén y tápala con su tapa o con papel de aluminio. Déjalas cocinarse 4 minutos, bajando el fuego a medio-bajo",
        "Sirve con aceite de chiles y la salsa de gyozas")
val imagenesPeparacionPanko = listOf(R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois,R.drawable.sushi, R.drawable.cocarrois)
val imagenesPeparacionKatsudon= listOf(R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois)
val katsudon = R.drawable.katsudon_titulo
val katsudonTitulo = "Katsudon"
