package com.example.myappderecetas.data

import com.example.myappderecetas.R

object Recetas {
    val RecetasList = listOf(
        Plato(
            id = 0,
            imagen = R.drawable.gyozasresultado,
            nombre = "Gyozas",
            descripcion = listOf("Las gyozas, también conocidas como empanadillas japonesas, son una auténtica delicia y muy fáciles de hacer.", "Con esta receta haremos unas 35 gyozas por menos de 10 euros, ridículo cuando lo comparas a los precios que tienen en los restaurantes (5 gyozas, por 5 euros). Congela todas las gyozas que no vayas a usar, y cuando tengas que hacerte la comida muy rápido, cocínalas exactamente igual que las cocinarías recién formadas, pero añade 2 minutos más dentro de la sartén para que se descongelen completamente. ¡Estarán como recién echas! "),
            ingredientes = listOf("310 g de harina", "155 ml de agua", "Una pizca de sal", "|", "375 g de carne picada de cerdo", "1,50 cm de jengible", "1/4 de cucharada (chuchara grande) de vino de arroz o de vino blanco", "1/8 de repollo", "1/2 de diente de ajo", "3 ajetes", "1/2 cucharada de salsa de soja", "3 granos de pimienta blanca", "1 pizca de sal", "1/2 cucharadilla de azúcar", "|", "37,5 ml de salsa de soja ", "12,5 ml de vinagre de arroz ", "Un poquito de sesamo"),
            pasosPreparacion = listOf("En un bol añade la harina de trigo y la sal. ",
        "Llevamos a ebullición el agua y en cuanto empiece a hervir, lo echamos en el bol y mezclamos bien",
        "Transfiere la masa a una superficie y amasa de 7 a 8 minutos, o hasta que sea elástica y lisa",
        "Cubre la masa con un trapo húmedo y déjala reposar una hora a temperatura ambiente",
        "Pon uno de los trozos con el lado del corte mirando hacia arriba y aplástalo con la palma de la mano",
        "Corta un churro en 16 trozos de igual tamaño.",
        "Pon uno de los trozos con el lado del corte mirando hacia arriba, y aplástalo con la palma de la mano",
        "Con un rodillo, estira la masa desde fuera hacia adentro, girando el disco poco a poco, dándole forma circular y dejando el centro más grueso que el borde", "Lo estiramos un poco con la mano y ya estaría hecha la masa, lista para poner el relleno dentro",
            "|", "Quítale el corazón al repollo y córtalo en trozos grandes",
            "Mételo en un cazo con agua hirviendo. Hiérvelo durante 10 minutos",
            "Pica los ajetes, pela el jengibre y los ajos",
            "Pon el repollo debajo de agua fría para parar la cocción",
            "Pícalo muy fino y después estrújalo para extraer toda el agua posible",
            "En un bol, añade la carne picada, el vino de arroz, el azúcar, la salsa de soja, la sal, los ajetes, el jengibre rallado, el ajo rallado, el repollo, el glutamato monosódico y la pimienta blanca",
            "Mezcla con la mano, siempre girando en la misma dirección, hasta que se adhiera a las paredes y sea pastoso",
            "Prueba y corrige sazonado. Resérvalo en la nevera cubierto con papel film",
            "Coge la masa y pon una cucharadilla de relleno en el centro",
            "Humedece la mitad del borde ligeramente con agua, y después cierra la gyoza, haciendo el patrón que más te guste. Repite con toda la masa",
            "En un bol pequeño, mezcla la salsa de soja, el vinagre de arroz y el sésamo. Resérvalo.",
            "Calienta una sartén antiadherente sobre fuego medio, añade un poco de aceite de girasol y coloca las gyozas. Déjalas tostarse 2 minutos, hasta que estén doradas por debajo",
            "Añade agua fría a la sartén y tápala con su tapa o con papel de aluminio. Déjalas cocinarse 4 minutos, bajando el fuego a medio-bajo",
            "Sirve con aceite de chiles y la salsa de gyozas"),

            imagenesPreparacion = listOf(R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois,R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois, R.drawable.cocarrois, R.drawable.sushi, R.drawable.cocarrois),
            tiempo = "2h 30min",
            personas = 4
            ),
        Plato(
            id = 1,
            imagen = R.drawable.katsudon_titulo,
            nombre = "Katsudon",
            descripcion = listOf("El katsudon es un plato japonés popular que consiste en tonkatsu (cerdo empanizado y frito) y huevos cocidos en un caldo dulce y salado servido sobre arroz. ", "Katsu, o \"chuleta\" en japonés, se refiere a la carne que se machaca finamente antes de cocinarla. Don , o donburi , lo identifica como un plato de tazón."),
            ingredientes = listOf("2 chuletas de cerdo deshuesadas y cortadas en el centro , machacadas hasta 1 centímetro de grosor", "Sal al gusto", "Pimienta negra recién molida , al gusto", "Harina para todo uso , para espolvorear", "5 huevos grandes , batidos, divididos", "1 taza de panko", "Aceite para freír", "Aceite para freír", "1 1/4 tazas de caldo de sopa dashi", "1/3 taza de salsa de soja", "2 cucharadas de mirín", "1 cucharada de azúcar", "1 cebolla mediana , en rodajas finas", "4 tazas de arroz japonés al vapor"),
            pasosPreparacion = listOf("Reúne los ingredientes",
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
                "Sirva colocando 1 porción de arroz al vapor en un tazón de arroz grande. Cubra con el tonkatsu cocido a fuego lento encima del arroz. Repita para hacer 3 porciones más"),
            imagenesPreparacion = listOf(R.drawable.paso1_katsudon, R.drawable.paso2_katsudon, R.drawable.paso3_katsudon, R.drawable.paso4_katsudon, R.drawable.paso5_katsudon, R.drawable.paso6_katsudon, R.drawable.paso7_katsudon, R.drawable.paso8_katsudon, R.drawable.paso9_katsudon, R.drawable.paso10_katsudon, R.drawable.paso11_katsudon, R.drawable.paso12_katsudon, R.drawable.paso13_katsudon, R.drawable.paso14_katsudon, R.drawable.paso15_katsudon, R.drawable.paso16_katsudon, R.drawable.paso17_katsudon, R.drawable.paso18_katsudon),
            tiempo = "45 min",
            personas = 1
        ),
    )
}