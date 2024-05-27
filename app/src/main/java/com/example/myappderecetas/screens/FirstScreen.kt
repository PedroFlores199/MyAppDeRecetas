package com.example.myappderecetas.screens

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.example.myappderecetas.R
import com.example.myappderecetas.navegation.AppScreens
import com.example.myappderecetas.ui.theme.Grey
import androidx.compose.ui.layout.ContentScale
import kotlinx.coroutines.launch


@Preview
@Composable
fun MyPreviewMain (navController: NavController = rememberNavController()) {
    FragmentoProncipal(navController)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FirstScreen (navController: NavController) {

    //Esto es un componente para estrupturar componentes basicos de una pantalla
    Scaffold {
        FragmentoProncipal(navController)
    }
}





@Composable
fun FragmentoProncipal (navController: NavController ) {

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#f7f5f2")))
    )
    {    LazyColumn {
        item {
            ParallaxToolbar(navController)
            PlatoDelDia(navController)
            RecetasDeLaSemana()
            SwipeablePages(navController)
        }
    }
    }
}




@Composable
fun ParallaxToolbar(navController: NavController) {

    Row(
        modifier = Modifier
            .statusBarsPadding()
            .padding(10.dp)
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
            Box {
                ConstraintLayout {

                    val (recetaDia, tituloReceta, descripcionReceta, cuadroInfTiempo, like) = createRefs()

                    Text(
                        text = "Receta del día",
                        style = TextStyle(
                            color = Color(color = 0xFF930D0D),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .padding(top = 100.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
                            .constrainAs(recetaDia) {
                                top.linkTo(parent.top)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            }
                    )

                    Text(
                        text = "Ramen con udon, shiitakes, huevo y langostinos",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
                            .constrainAs(tituloReceta) {
                                top.linkTo(recetaDia.bottom)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            }
                    )

                    //Nota importante: Para que el texto tenga el mismo tamaño se pode sp en vez de dp

                    Text(
                        text = "¡Hoy, la cena japonesa la hacemos en casa! Prepárales un ramen con udon, setas shiitake, huevo, espinacas y langostinos. Haz la lista de la compra con ingredientes orientales para que quede perfecto.",
                        modifier = Modifier
                            .padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
                            .constrainAs(descripcionReceta) {
                                top.linkTo(tituloReceta.bottom)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            },
                        fontSize = 14.sp, // Tamaño del texto en sp
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis
                    )



                    Box(modifier = Modifier
                        .constrainAs(cuadroInfTiempo) {
                            top.linkTo(descripcionReceta.top, margin = 90.dp)
                            start.linkTo(parent.start, margin = 20.dp)
                        })


                    {

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
                                fontSize = 20.sp,
                            )
                        }
                    }
                    Box (modifier = Modifier
                        .size(100.dp)
                        .constrainAs(like) {
                            top.linkTo(descripcionReceta.top, margin = 60.dp)
                            end.linkTo(parent.end, margin = 20.dp)
                        }){
                        val composition by rememberLottieComposition(
                            spec = LottieCompositionSpec.RawRes(
                                R.raw.like3
                            )
                        )

                        val progress by animateLottieCompositionAsState(
                            composition = composition,
                            iterations = LottieConstants.IterateForever
                        )

                        LottieAnimation(
                            composition = composition,
                            progress = {
                                progress
                            }
                        )
                    }
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

/*
data class Ingrediente(
    @DrawableRes val imagen: Int,
    val nombre: String,
    val ingrediente: List<String>
)

val recipeList = listOf(Ingrediente(R.drawable.ramen_seg_pan, "Ramen", listOf("150 gramos de fideos noodles", "2 huevos", "Cebolletas para usar la parte verde", "1 alga nori", "1 litro de caldo de pollo", "6 setas shiitake", "1 pechugas de pollo", "4 dientes de ajo", "80 mililitros de salsa de soja", "2 cucharadas de aceite de oliva", "1 trozo de jengibre" , "30 gramos de mantequilla", "2 cucharaditas de azúcar", "1 cucharadita de sal"))
    , listOf(Ingrediente(R.drawable.ramen_seg_pan, "Cocarrois", listOf("250 gramos de manteca", "Un vaso de aceite de oliva", "250 mililitros de agua", "900 gramos de harina", "sal", "1 coliflor", "20 gramos de acelgas", "Aceite de oliva", "sal", "Pimienta", "Pimenton"))))
*/
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
        /*
        Text(
            text = "Recetas sencillas y buenas para esta semana",
            style = TextStyle(
                color = Color.Gray,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            ),

            modifier = Modifier
                .padding(bottom = 20.dp, start = 50.dp, end = 60.dp)
        )*/
    }
}
    val comida = listOf(
        R.drawable.sushi,
        R.drawable.cocarrois
    )



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SwipeablePages (navController: NavController) {

    val comida = listOf(
        R.drawable.katsudon_titulo,
        R.drawable.cocarrois
    )
    val tituloComidaSem = listOf(
        "Katsudon ",
        "Cocarris"
    )
    val subTituloComidaSem = listOf(
        "El katsudon es un plato japonés popular que consiste en tonkatsu (cerdo empanizado y frito) y huevos cocidos en un caldo dulce y salado servido sobre arroz.",
        "La receta de cocarrois es una delicia originaria de Mallorca y también de Ibiza. Se caracteriza por tener como relleno una mezcla de diversas verduras con condimentos básicos."
    )

    var pagerState = rememberPagerState(initialPage = 0) {
        comida.size
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        HorizontalPager(state = pagerState) { index ->

            Box(
                modifier = Modifier
                    .fillMaxWidth() // Use fillMaxWidth instead of fillMaxSize to allow height adjustment
                    .height(450.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .background(Color(color = 0xFF5C0A0A))
                    .align(Alignment.BottomCenter)
                    .clickable { navController.navigate(route = AppScreens.Katsudon.route) }
            ) {
                ConstraintLayout {
                    val (titulo, imagen, subTitulo) = createRefs()
                    Image(
                        painter = painterResource(id = comida[index]),
                        contentDescription = null,
                        contentScale = ContentScale.Inside,
                        modifier = Modifier
                            .clip(RoundedCornerShape(40.dp))
                            .constrainAs(imagen) {
                                top.linkTo(parent.top)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            }
                            .clickable { navController.navigate(route = AppScreens.Katsudon.route) }
                    )
                    Text(
                        text = tituloComidaSem[index],
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.constrainAs(titulo) {
                            top.linkTo(imagen.bottom, margin = 20.dp)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                    )
                    Text(
                        text = subTituloComidaSem[index],
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        ),

                        modifier = Modifier
                            .padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
                            .constrainAs(subTitulo) {
                                top.linkTo(titulo.bottom, margin = 20.dp)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            }
                    )

                }
            }
        }
    }

            Row(
                Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(comida.size) {

                    //Si la pagina actual coincide con el numero de iteracion del repeat se vera von un color gris oscuro
                    val color =
                        if (pagerState.currentPage == it) Color.DarkGray else Color.LightGray

                    val scope = rememberCoroutineScope()
                    Box(
                        modifier = Modifier
                            .padding(2.dp)
                            .clip(CircleShape)
                            .size(20.dp)
                            .background(color)
                            .clickable {
                                scope.launch {
                                    pagerState.animateScrollToPage(it)
                                }
                            }

                    )
                }
            }
        }







