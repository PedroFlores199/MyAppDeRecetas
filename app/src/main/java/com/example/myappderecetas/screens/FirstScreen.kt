package com.example.myappderecetas.screens

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarColors
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myappderecetas.data.Plato
import com.example.myappderecetas.data.Recetas
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.ZoneId


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
            //BarraBusqueda()
            //ParallaxToolbar(navController)
            PlatoDelDia(navController)
            // RecetasDeLaSemana()
            SwipeablePages(navController)


        }
    }
    }
}


@Composable
fun BarraBusqueda() {
    var text by rememberSaveable { mutableStateOf("") }
    var expanded by rememberSaveable { mutableStateOf(false) }
    val focusRequester = remember { FocusRequester() }
    val coroutineScope = rememberCoroutineScope()

    Box(Modifier.fillMaxSize()) {
        Column {
            // Campo de búsqueda utilizando TextField
            TextField(
                value = text,
                onValueChange = { newText -> text = newText },
                placeholder = { Text("Buscar recetas...") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Ícono de búsqueda") },
                trailingIcon = {
                    if (text.isNotEmpty()) {
                        IconButton(onClick = { text = "" }) {
                            Icon(Icons.Default.Clear, contentDescription = "Limpiar búsqueda")
                        }
                    } else {
                        Icon(Icons.Default.MoreVert, contentDescription = "Más opciones")
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .focusRequester(focusRequester)
                    .onFocusChanged { focusState ->
                        expanded = focusState.isFocused // Cambia el estado expandido basado en el enfoque
                    },
            )

            // Mostrar recetas filtradas cuando hay texto de búsqueda
            if (text.isNotEmpty()) {
                val filteredOptions = Recetas.RecetasList.filter { it.nombre.contains(text, ignoreCase = true) }
                LazyColumn {
                    items(filteredOptions) { receta ->
                        Text(text = receta.nombre, modifier = Modifier.padding(8.dp))
                    }
                }
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
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
            .clickable { },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(RoundedCornerShape(8.dp))
                .clickable { }
                .background(Color.White)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.menu20px),
                contentDescription = null,
                tint = Grey,
                modifier = Modifier.size(50.dp)

            )
        }
/*
        Image(
            painter = painterResource(id = R.drawable.icono_menu),
            contentDescription = null,
            modifier = Modifier
                .height(60.dp)
                .clickable { }
        )
 */

        Icon(
            painter = painterResource(id = R.drawable.search20px),
            contentDescription = null,
            tint = Grey,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
            //.padding(top = 20.dp, end = 16.dp)
        )

    }
}

@Composable
fun PlatoDelDia (navController: NavController) {
    val platos = Recetas.RecetasList

    // Obtener el día del año actual
    val dayOfYear by remember { mutableStateOf(getCurrentDayOfYear()) }

    // Calcular el índice inicial basado en el día del año
    val startIndex = dayOfYear % platos.size

    // Seleccionar los 5 elementos para mostrar
    val displayedPlatos = (0 until 1).map {
        platos[(startIndex + it) % platos.size]
    }

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
                .clickable {
                    val recipeId = displayedPlatos.first().id
                    navController.navigate(route = "${AppScreens.CarruselRecetas.route}/$recipeId")
                }
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
                        text = displayedPlatos.first().nombre,
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
                        text = displayedPlatos.first().descripcion.first(),
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
                painter = painterResource(id = displayedPlatos.last().imagen),
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .align(Alignment.TopCenter)
                    .clickable {
                        navController.navigate(
                            AppScreens.CarruselRecetas.createRoute(
                                displayedPlatos.last().id
                            )
                        )
                    }
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
/*
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
*/

fun getCurrentDayOfYear(): Int {
    val today = LocalDate.now(ZoneId.systemDefault())
    return today.dayOfYear
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SwipeablePages(navController: NavController) {
    // Obtener la configuración actual
    val configuracion = LocalConfiguration.current

    // Obtener los platos
    val platos = Recetas.RecetasList

    // Obtener el día del año actual de manera optimizada
    val dayOfYear by remember { mutableStateOf(getCurrentDayOfYear()) }

    // Calcular el índice inicial basado en el día del año
    val startIndex = dayOfYear % platos.size

    // Seleccionar los 5 elementos para mostrar
    val displayedPlatos = (1 until 6).map {
        platos[(startIndex + it) % platos.size]
    }

    val pagerStateSimples = rememberPagerState(initialPage = 0) {
        displayedPlatos.size
    }

    val pagerStateComplejas = rememberPagerState(initialPage = 0) {
        displayedPlatos.size
    }

    if (configuracion.orientation == Configuration.ORIENTATION_LANDSCAPE) {
        // En modo horizontal, mostrar los dos swipeables en columnas (uno al lado del otro)
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(30.dp)) // Espacio entre el título y los swipeables

            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally // Centrar el contenido horizontalmente
                ) {
                    Text(
                        text = "Recetas Simples",
                        style = TextStyle(
                            color = Color(color = 0xFF930D0D),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(bottom = 10.dp) // Espacio entre el título y el swipeable
                    )
                    SwipeablePagesSimples(navController, pagerStateSimples, displayedPlatos)
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Recetas Complejas",
                        style = TextStyle(
                            color = Color(color = 0xFF930D0D),
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(bottom = 10.dp) // Espacio entre el título y el swipeable
                    )
                    SwipeablePagesComplejas(navController, pagerStateComplejas, displayedPlatos)
                }
            }
        }
    } else {
        // En modo vertical, mostrar los swipeables apilados uno debajo del otro
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = "Recetas Simples",
                style = TextStyle(
                    color = Color(color = 0xFF930D0D),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(20.dp) // Espacio entre el título y el swipeable
            )

            Box (
                modifier = Modifier.padding(40.dp)
            ) {
                SwipeablePagesSimples(navController, pagerStateSimples, displayedPlatos)
            }

            Text(
                text = "Recetas Complejas",
                style = TextStyle(
                    color = Color(color = 0xFF930D0D),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(20.dp)
            )

            Box (
                modifier = Modifier.padding(40.dp)
            ) {
                SwipeablePagesComplejas(navController, pagerStateComplejas, displayedPlatos)
            }
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SwipeablePagesSimples(
    navController: NavController,
    pagerState: PagerState,
    displayedPlatos: List<Plato>
) {
    HorizontalPager(
        state = pagerState,
        pageSpacing = 16.dp // Añadir espacio entre las páginas
    ) { index ->
        AnimatedVisibility(
            visible = pagerState.currentPage == index,
            enter = fadeIn(animationSpec = tween(durationMillis = 300)) + slideInHorizontally(initialOffsetX = { it }),
            exit = fadeOut(animationSpec = tween(durationMillis = 300)) + slideOutHorizontally(targetOffsetX = { it })
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(color = 0xFF930D0D))
            ) {
                Image(
                    painter = painterResource(id = displayedPlatos[index].imagen),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable {
                            val recipeId = displayedPlatos[index].id
                            navController.navigate(route = "${AppScreens.CarruselRecetas.route}/$recipeId")
                        }
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(Color(color = 0xFF930D0D))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 20.dp, start = 20.dp, end = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = displayedPlatos[index].nombre,
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                            ),
                            modifier = Modifier.padding(bottom = 10.dp)
                        )

                        Text(
                            text = displayedPlatos[index].descripcion.first(),
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(top = 50.dp, bottom = 20.dp, start = 20.dp, end = 20.dp),
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SwipeablePagesComplejas(
    navController: NavController,
    pagerState: PagerState,
    displayedPlatos: List<Plato>
) {
    HorizontalPager(
        state = pagerState,
        pageSpacing = 16.dp // Añadir espacio entre las páginas
    ) { index ->
        AnimatedVisibility(
            visible = pagerState.currentPage == index,
            enter = fadeIn(animationSpec = tween(durationMillis = 300)) + slideInHorizontally(initialOffsetX = { it }),
            exit = fadeOut(animationSpec = tween(durationMillis = 300)) + slideOutHorizontally(targetOffsetX = { it })
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(color = 0xFF930D0D))
            ) {
                Image(
                    painter = painterResource(id = displayedPlatos[index].imagen),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable {
                            val recipeId = displayedPlatos[index].id
                            navController.navigate(route = "${AppScreens.CarruselRecetas.route}/$recipeId")
                        }
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(Color(color = 0xFF930D0D))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 20.dp, start = 20.dp, end = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = displayedPlatos[index].nombre,
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                            ),
                            modifier = Modifier.padding(bottom = 10.dp)
                        )

                        Text(
                            text = displayedPlatos[index].descripcion.first(),
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(top = 50.dp, bottom = 20.dp, start = 20.dp, end = 20.dp),
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }
        }
    }
}
