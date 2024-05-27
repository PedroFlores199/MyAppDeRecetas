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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
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
                FotoReceta(gyozasImagen)
                InfoReceta()
                TituloComida(gyozasTitulo, descripcionGyozas)
                Ingredientes()
                Preparacion()
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
        )
    }
}

val descripcionGyozas = listOf("Las gyozas, también conocidas como empanadillas japonesas, son una auténtica delicia y muy fáciles de hacer.", "Con esta receta haremos unas 35 gyozas por menos de 10 euros, ridículo cuando lo comparas a los precios que tienen en los restaurantes (5 gyozas, por 5 euros). Congela todas las gyozas que no vayas a usar, y cuando tengas que hacerte la comida muy rápido, cocínalas exactamente igual que las cocinarías recién formadas, pero añade 2 minutos más dentro de la sartén para que se descongelen completamente. ¡Estarán como recién echas! ")
val masaGyozas = listOf("310 g de harina", "155 ml de agua", "Una pizca de sal")
val rellenoDeGyozas = listOf ("375 g de carne picada de cerdo", "1,50 cm de jengible", "1/4 de cucharada (chuchara grande) de vino de arroz o de vino blanco", "1/8 de repollo", "1/2 de diente de ajo", "3 ajetes", "1/2 cucharada de salsa de soja", "3 granos de pimienta blanca", "1 pizca de sal", "1/2 cucharadilla de azúcar" )
val salsaGyozas = listOf("37,5 ml de salsa de soja ", "12,5 ml de vinagre de arroz ", "Un poquito de sesamo")
val preparacionMasa = listOf("En un bol añade la harina de trigo y la sal. ",
    "Llevamos a ebullición el agua y en cuanto empiece a hervir, lo echamos en el bol y mezclamos bien",
    "Transfiere la masa a una superficie y amasa de 7 a 8 minutos, o hasta que sea elástica y lisa",
    "Cubre la masa con un trapo húmedo y déjala reposar una hora a temperatura ambiente",
    "Pon uno de los trozos con el lado del corte mirando hacia arriba y aplástalo con la palma de la mano",
    "Corta un churro en 16 trozos de igual tamaño.",
    "Pon uno de los trozos con el lado del corte mirando hacia arriba, y aplástalo con la palma de la mano",
    "Con un rodillo, estira la masa desde fuera hacia adentro, girando el disco poco a poco, dándole forma circular y dejando el centro más grueso que el borde", "Lo estiramos un poco con la mano y ya estaría hecha la masa, lista para poner el relleno dentro")
val preparacionGyozas = listOf("Quítale el corazón al repollo y córtalo en trozos grandes",
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
val imagenesPeparacionMasa = listOf(R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois,R.drawable.sushi, R.drawable.cocarrois)
val imagenesPeparacionGyozas= listOf(R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois)
val gyozasImagen = R.drawable.gyozasresultado
val gyozasTitulo = "Gyozas"



@Composable
fun FotoReceta (Inav: Int = gyozasImagen){
    Spacer(
        modifier = Modifier
            .height(20.dp)
    )

    Box() {
        Image(
            painter = painterResource(id = Inav),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()

        )
    }
}



@Composable
fun InfoReceta () {
    Box (modifier = Modifier.padding(20.dp)){
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
                        text = "2h 30min",
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
                        text = "4",
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

@Preview
@Composable
fun TituloComida(gyozasT: String = gyozasTitulo, gyozasD: List<String> = descripcionGyozas) {

        Text(
            text = gyozasTitulo,
            fontFamily = fontFamily,
            color = Color.Black,
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
            ),
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp, start = 20.dp, end = 10.dp)
        )

    for (i in 0 until descripcionGyozas.size) {
        Text(
            text = descripcionGyozas[i] + "\n",
            fontFamily = fontFamily2,
            color = Color.Black,
            style = TextStyle(
                fontSize = 18.sp),
            modifier = Modifier
                .padding(top = 3.dp, bottom = 2.dp, start = 20.dp, end = 10.dp))
    }
    }

@Preview
@Composable
fun Ingredientes () {

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
    Text(
        text = ("Para la masa de Gyozas"),
        fontFamily = fontFamily,
        color = Color.Black,
        style = TextStyle(
            fontSize = 28.sp,
        ),
        modifier = Modifier
            .padding(top = 10.dp, bottom = 10.dp, start = 20.dp, end = 20.dp),
            fontWeight = FontWeight.Bold
    )

    for (i in 0 until masaGyozas.size) {
        Text(
            text = masaGyozas[i],
            fontFamily = fontFamily2,
            color = Color.Black,
            style = TextStyle(
                fontSize = 18.sp),
            modifier = Modifier
                .padding(top = 3.dp, bottom = 3.dp, start = 20.dp, end = 10.dp))
    }
    Text(
        text = ("Para el relleno de gyozas"),
        fontFamily = fontFamily,
        color = Color.Black,
        style = TextStyle(
            fontSize = 28.sp,
        ),
        modifier = Modifier
            .padding(top = 10.dp, bottom = 20.dp, start = 20.dp, end = 20.dp),
            fontWeight = FontWeight.Bold
    )
    for (i in 0 until rellenoDeGyozas.size) {
        Text(
            text = rellenoDeGyozas[i],
            fontFamily = fontFamily2,
            color = Color.Black,
            style = TextStyle(
                fontSize = 18.sp),
            modifier = Modifier
                .padding(top = 4.dp, bottom = 3.dp, start = 20.dp, end = 10.dp))
    }
    Text(
        text = ("Para la salsa de Gyozas"),
        fontFamily = fontFamily,
        color = Color.Black,
        style = TextStyle(
            fontSize = 28.sp,
        ),
        modifier = Modifier
            .padding(top = 10.dp, bottom = 20.dp, start = 20.dp, end = 20.dp),
            fontWeight = FontWeight.Bold
    )
    for (i in 0 until salsaGyozas.size) {
        Text(
            text = salsaGyozas[i],
            fontFamily = fontFamily2,
            color = Color.Black,
            style = TextStyle(
                fontSize = 18.sp),
            modifier = Modifier
                .padding(top = 3.dp, bottom = 3.dp, start = 20.dp, end = 10.dp))
    }

}

@Composable
fun Preparacion () {
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

    Text(
        text = ("Peparacion de la masa"),
        fontFamily = fontFamily,
        color = Color.Black,
        style = TextStyle(
            fontSize = 28.sp,
        ),
        modifier = Modifier
            .padding(top = 10.dp, bottom = 20.dp, start = 20.dp, end = 20.dp),
            fontWeight = FontWeight.Bold
    )

    for (i in 0 until preparacionMasa.size) {
        Text(
            text = preparacionMasa[i],
            fontFamily = fontFamily2,
            color = Color.Black,
            style = TextStyle(
                fontSize = 18.sp),
            modifier = Modifier
                .padding(top = 3.dp, bottom = 10.dp, start = 20.dp, end = 10.dp))

        Image(
            painter = painterResource(id = imagenesPeparacionMasa[i]),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 3.dp, bottom = 50.dp, start = 20.dp, end = 10.dp)

        )
    }
    Text(
        text = ("Peparacion de las Gyozas"),
        fontFamily = fontFamily,
        color = Color.Black,
        style = TextStyle(
            fontSize = 28.sp,
        ),
        modifier = Modifier
            .padding(top = 10.dp, bottom = 20.dp, start = 20.dp, end = 20.dp),
        fontWeight = FontWeight.Bold
    )

    for (i in 0 until preparacionGyozas.size) {
        Text(
            text = preparacionGyozas[i],
            fontFamily = fontFamily2,
            color = Color.Black,
            style = TextStyle(
                fontSize = 18.sp),
            modifier = Modifier
                .padding(top = 3.dp, bottom = 10.dp, start = 20.dp, end = 10.dp))

        Image(
            painter = painterResource(id = imagenesPeparacionGyozas[i]),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 3.dp, bottom = 50.dp, start = 20.dp, end = 10.dp)

        )
    }
}






