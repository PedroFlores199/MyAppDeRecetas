package com.example.myappderecetas.data

import com.example.myappderecetas.R

object Recetas {
    val RecetasList = listOf(
        Plato(
            id = 0,
            imagen = R.drawable.katsudon_titulo,
            nombre = "Katsudon",
            descripcion = listOf("El katsudon es un plato japonés popular que consiste en tonkatsu (cerdo empanizado y frito) y huevos cocidos en un caldo dulce y salado servido sobre arroz. ", "Katsu, o \"chuleta\" en japonés, se refiere a la carne que se machaca finamente antes de cocinarla. Don , o donburi , lo identifica como un plato de tazón."),
            ingredientes = listOf("2 chuletas de cerdo deshuesadas y cortadas en el centro, machacadas hasta 1 centímetro de grosor", "Sal al gusto", "Pimienta negra recién molida , al gusto", "Harina para todo uso , para espolvorear", "5 huevos grandes , batidos, divididos", "1 taza de panko", "Aceite para freír", "Aceite para freír", "1/4 tazas de caldo de sopa dashi", "1/3 taza de salsa de soja", "2 cucharadas de mirín", "1 cucharada de azúcar", "1 cebolla mediana , en rodajas finas", "4 tazas de arroz japonés al vapor"),
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
            personas = 1,
            etapasIngredientes = listOf(""),
            etapasPreparacion = listOf("")
        ),
        Plato(
            id = 1,
            imagen = R.drawable.pancakejp_titulo,
            nombre = "Japanese Souffle Pancakes",
            descripcion = listOf("Conocidas por su gran altura y textura similar a la de un pastel, las panqueques soufflé son una versión impresionante del clásico desayuno, popularizadas por las cafeterías en Japón ", "Aunque el nombre puede sonar intimidante, todos los ingredientes—harina, huevos, leche, mantequilla—son fáciles de encontrar en tu despensa y coinciden con los de los panqueques americanos.","Esta receta requiere cocinar la masa en moldes circulares para obtener un panqueque redondo, alto y perfecto."),
            ingredientes = listOf("4 claras de huevo grandes", "1/2 cucharadita de jugo de limón", "1/2 cucharadita de sal", "6 cucharadas de azúcar", "2 yemas de huevo grandes", "2 cucharaditas de extracto de vainilla", "1/4 taza de leche entera, temperatura ambiente", "2 cucharadas de mantequilla salada, derretida", "6 cucharadas de harina para pastel", "1 cucharadita de polvo para hornear"),
            pasosPreparacion = listOf("Reúne los ingredientes. Calienta una sartén antiadherente a fuego lento mientras preparas la masa. ",
                "Agregue las claras de huevo, el jugo de limón y la sal a un tazón grande para mezclar o al tazón de una batidora de pie. Batir con el accesorio para batir a velocidad media hasta que esté espumoso y esponjoso. unos 3 minutos.",
                "Sigue batiendo a velocidad alta y poco a poco añade 5 cucharadas de azúcar mientras bates. Las claras se volverán brillantes y se formarán picos rígidos cuando levante la batidora de las claras. La punta del pico se caerá y el resto del pico se mantendrá completamente derecho, aproximadamente 7 minutos.",
                "Agrega las yemas de huevo a otro tazón más pequeño. Batir la cucharada restante de azúcar y extracto de vainilla con las yemas hasta que estén pálidas y suaves, aproximadamente 1 minuto.",
                "Agrega la leche y la mantequilla a la mezcla de yemas de huevo. Batir para combinar.",
                "Agregue la harina y el polvo para hornear y mezcle para combinar.",
                "Agregue cucharadas de claras a la mezcla de yemas, incorporando con cuidado sin desinflar las claras. Agrega todas las claras hasta que ya no queden vetas de yemas. No mezcle demasiado.",
                "Engrasa la sartén con aceite en aerosol antiadherente. Engrase aros de masa de 3 pulgadas de ancho. Colócalos en la sartén tibia. Déjelos calentar durante aproximadamente 1 minuto.",
                "Agregue aproximadamente 1/2 taza de masa a cada uno de los aros.",
                "Coloque unas cucharaditas de agua en los lugares desnudos de la sartén y luego cubra los aros con una tapa. Cocine de 5 a 7 minutos o hasta que hayan subido y se hayan formado burbujas en la parte superior. También deben estar casi completamente cocidos. Esto hará que sea más fácil darles la vuelta y dejará menos margen de error.",
                "Retire la tapa. Desliza una espátula debajo del aro para panqueques. Coloca otra espátula encima del aro y voltea los panqueques. Luego deslice la espátula hacia afuera desde debajo del anillo.",
                "Vuelva a tapar y cocine durante unos 2 o 3 minutos. Si están completamente cocidos, los panqueques todavía se moverán ligeramente, pero volverán a saltar cuando los toques. Cada lado debe estar ligeramente dorado. \n" +
                        "\n" +
                        "Retire con cuidado los anillos. Puedes aflojar los bordes del anillo con un cuchillo. Repita el proceso de cocción con los panqueques restantes hasta que toda la masa esté cocida. ",
                "Sirva inmediatamente con mantequilla batida, jarabe de arce y fruta."),
            imagenesPreparacion = listOf(R.drawable.paso1_pancakejp, R.drawable.paso2_pancakejp, R.drawable.paso3_pancakejp, R.drawable.paso4_pancakejp, R.drawable.paso5_pancakejp, R.drawable.paso6_katsudon, R.drawable.paso7_pancakejp, R.drawable.paso8_pancakejp, R.drawable.paso9_pancakejp, R.drawable.paso10_pancakejp, R.drawable.paso11_pancakejp, R.drawable.paso12_pancakejp, R.drawable.pancakejp_titulo),
            tiempo = "55 min",
            personas = 2,
            etapasIngredientes = listOf(""),
            etapasPreparacion = listOf("")
        ),
        Plato(
            id = 2,
            imagen = R.drawable.katsupollo_titulo,
            nombre = "Katsu de Pollo",
            descripcion = listOf("El chicken katsu es una variación del clásico plato japonés, que tradicionalmente se hace con cerdo. Estas chuletas de pollo crujientes y crocantes están cubiertas con una salsa tonkatsu dulce y salada que es simplemente irresistible.", "Es lo suficientemente simple para hacer cualquier día de la semana, pero es un poco diferente de la típica chuleta de pollo. Es tradicionalmente japonés y a menudo se sirve como un plato principal en los restaurantes."),
            ingredientes = listOf("2 pechugas de pollo", "2 cucharadas de jerez o vino de arroz", "1 cucharada de salsa de soja", "3 cucharaditas de sal, divididas", "1 o 1/2 al gusto de cucharaditas de pimienta negra recién molida, cantidad dividida", "1/2 taza de harina para todo uso", "3 huevos grandes , batidos", "2 tazas de pan rallado panko", "1 taza de aceite vegetal", "Arroz de grano corto , para servir", "Salsa Tonkatsu , para servir", "Cebolletas , picadas, para servir"),
            pasosPreparacion = listOf("Reúne los ingredientes",
                "Corta las pechugas de pollo en 2 chuletas separadas. Golpee cada pechuga hasta que tenga un grosor de 1/2 pulgada. Agregue las chuletas a un tazón poco profundo y cubra con salsa de soja y jerez (o vino de arroz). Reservar tapado durante al menos 15 minutos o hasta 4 horas. Si marina por más de 15 minutos, colóquelo en el refrigerador.",
                "Agregue una cucharadita de sal y 1/2 cucharadita de pimienta a la harina en un tazón poco profundo y revuelva para combinar. Retire el pollo de la marinada y reserve la marinada. Lo usarás de nuevo. Sumerja cada pechuga de pollo en la harina y voltéela para cubrir ambos lados por completo. ",
                "Agrega una cucharadita de sal y 1/2 cucharadita de pimienta al bol de salsa de soja y jerez que reservaste. Batir los huevos en esa mezcla hasta que quede suave. Sumerja cada una de las chuletas de pollo recubiertas de harina en la mezcla de huevo y voltéelas para cubrir ambos lados. ",
                "Agregue el pan rallado panko a un tazón poco profundo y agregue el resto de la sal y la pimienta al tazón. Revuelva para combinar y luego agregue las chuletas de pollo recubiertas de huevo a la mezcla de pan rallado panko. Si desea que la capa sea más espesa, puede sumergirlos nuevamente en la mezcla de huevo y luego nuevamente en la mezcla de pan rallado.",
                "Calienta el aceite a fuego medio alto. Comprueba que el aceite esté lo suficientemente caliente añadiendo un poco de pan rallado al aceite. Si chisporrotean, está listo. Agrega 2 de las chuletas al aceite caliente y cocina de 2 a 3 minutos por lado. Revise los bordes de la chuleta mientras se cocina para ver si se quema. Baje o ajuste el fuego según sea necesario. No se fríen las chuletas sino que se fríen en una buena cantidad de aceite.",
                "Escurre las chuletas en un plato forrado con papel toalla o colócalas en una rejilla para enfriar sobre una bandeja para hornear. Puedes mantenerlas calientes en un horno a 200 F mientras fríes las otras 2 chuletas. ",
                /*"Freír las otras 2 chuletas y luego servir con salsa tonkatsu y arroz. También puedes cubrir con cebolletas picadas."*/), //Me falta otra imagen
            imagenesPreparacion = listOf(R.drawable.paso1_katsupollo, R.drawable.paso2_katsupollo, R.drawable.paso3_katsupollo, R.drawable.paso4_katsupollo, R.drawable.paso5_katsupollo, R.drawable.paso6_katsupollo, R.drawable.paso7_katsupollo),
            tiempo = "42 min",
            personas = 4,
            etapasIngredientes = listOf(""),
            etapasPreparacion = listOf("")
        ),
        Plato(
            id = 3,
            imagen = R.drawable.dorayaki_titulo,
            nombre = "Dorayaki",
            descripcion = listOf("El dulce tradicional japonés dorayaki está hecho de dos panqueques estilo americano del tamaño de una mano intercalados con un relleno dulce, el más popular de los cuales son los frijoles rojos azuki ( anko ). Sin embargo, también son populares las natillas, las castañas (kuri) y la nata (crema de matcha, crema con frutas, etc.). Dorayaki es un favorito muy querido tanto por niños como por adultos en Japón."),
            ingredientes = listOf("2 huevos grandes", "2/3 taza de azúcar", "1/2 cucharadita de bicarbonato de sodio", "3 cucharadas de agua o leche", "1 taza de harina para todo uso tamizada", "1/2 taza de harina para todo uso", "Aceite vegetal , para freír", "3/4 libra de anko (pasta dulce de frijol azuki)"),
            pasosPreparacion = listOf("Reúne los ingredientes",
                "Pon en un bol los huevos y el azúcar y bate muy bien.",
                "Disuelva el bicarbonato de sodio en agua.",
                "Agregue agua a la mezcla de huevo.",
                "Agregue la harina tamizada a la mezcla de huevo gradualmente.",
                "Calentar una sartén o plato caliente y engrasarlo ligeramente.",
                "Vierta una cucharada de masa en la sartén y haga un panqueque pequeño (de aproximadamente 3 a 4 pulgadas de diámetro).",
                "Darle la vuelta cuando aparezcan burbujas en la superficie.",
                "Repita este proceso para cada panqueque.",
                "Enfriar los panqueques.",
                "Haga pares de panqueques y coloque una cucharada de frijoles dulces anko entre ellos."
            ),
            imagenesPreparacion = listOf(R.drawable.paso1_dorayaki, R.drawable.paso2_dorayaki, R.drawable.paso3_dorayaki, R.drawable.paso4_dorayaki, R.drawable.paso5_dorayaki, R.drawable.paso6_dorayaki, R.drawable.paso7_dorayaki, R.drawable.paso8_dorayaki, R.drawable.paso9_dorayaki, R.drawable.paso10_dorayaki, R.drawable.paso11_dorayaki),
            tiempo = "30 min",
            personas = 2,
            etapasIngredientes = listOf(""),
            etapasPreparacion = listOf("")
        ),
        Plato(
            id = 4,
            imagen = R.drawable.purin_titulo,
            nombre = "Purin",
            descripcion = listOf("Purin es un postre de natillas frías parecido a un flan en Japón . El nombre “Purin” proviene de “pudding”, pero no es lo mismo que el pegajoso pudín de Estados Unidos. Tiene una textura más firme similar al flan mexicano y además lleva salsa de caramelo encima. Es un dulce muy básico (sedoso, cremoso, rico y suave) que se sirve frío y es adorado en Japón."),
            ingredientes = listOf("Mantequilla, para los moldes", "3 cucharadas de agua tibia, divididas", "6 cucharadas de azúcar", "2 tazas de leche", "2/3 taza de azúcar", "1 cucharadita de extracto puro de vainilla", "4 huevos grandes"),
            pasosPreparacion = listOf("Reúne los ingredientes",
                "Unte con mantequilla los moldes de budín individuales.",
                "Calienta 2 cucharadas de agua en una cacerola, luego agrega 6 cucharadas de azúcar y cocina a fuego lento hasta que la salsa se dore. Agregue con cuidado 1 cucharada de agua tibia para diluir la salsa.",
                "Vierta la salsa en los moldes.",
                "Coloque la leche en una cacerola mediana y caliéntela a aproximadamente 140 F.",
                "Disuelva 2/3 de taza de azúcar en la leche y agregue el extracto de vainilla.",
                "Alejar del calor.",
                "Batir ligeramente los huevos en un bol.",
                "Agregue gradualmente leche tibia a la mezcla de huevo.",
                "Pasa la mezcla de huevo por un colador.",
                "Saque algunas burbujas de la superficie de la mezcla de huevo colada.",
                "Vierta el resto de la mezcla de huevo sobre la salsa en los moldes.",
                "Coloque los moldes de pudín en una vaporera y cocine al vapor a fuego lento durante unos 15 a 20 minutos o hasta que estén bien cocidos",
                "Apaga el fuego y déjalas enfriar.",
                "Retirar el pudín de los moldes y servir en platos."
            ),
            imagenesPreparacion = listOf(R.drawable.paso1_purin, R.drawable.paso2_purin, R.drawable.paso3_purin, R.drawable.paso4_purin, R.drawable.paso5_purin, R.drawable.paso6_purin, R.drawable.paso7_purin, R.drawable.paso8_purin, R.drawable.paso9_purin, R.drawable.paso10_purin, R.drawable.paso11_purin, R.drawable.paso12_purin, R.drawable.paso13_purin, R.drawable.paso14_purin, R.drawable.paso15_purin),
            tiempo = "30 min",
            personas = 2,
            etapasIngredientes = listOf(""),
            etapasPreparacion = listOf("")
        ),
        Plato(
            id = 5,
            imagen = R.drawable.ramenshoyu_titulo,
            nombre = "Ramen Shoyu rápido",
            descripcion = listOf("El shoyu es solo uno de los varios tipos de ramen. Otras categorías comunes incluyen el shio, tonkotsu y miso ramen. Entre estos, la versión con salsa de soya se destaca por sus fideos rizados y su caldo ligero, pero sabroso, salado y con un toque ácido. Haz de esto una comida sirviéndolo junto con tempura de vegetales o cubre tus tazones con pollo, cerdo o vegetales cocidos."),
            ingredientes = listOf("1 cucharadita de aceite de sésamo", "1 cucharadita de jengibre fresco picado", "1 diente de ajo , picado", "2 tazas de caldo de pollo", "1 taza de caldo de sopa kombu dashi casero o comprado en la tienda", "3 cucharadas de salsa de soja", "1 cucharada de sake", "1 cucharadita de azúcar", "1 cucharadita de sal","2 paquetes (3 onzas) de fideos chukamen secos", "Negi , o cebolleta , picada, para decorar opcionalmente", "Nori , algas secas, para decorar opcionalmente", "Pimienta negra recién molida , al gusto"
                ),

            pasosPreparacion = listOf(
                "Reúne los ingredientes.",
                "Calienta el aceite de sésamo en una sartén profunda a fuego medio. Saltee el jengibre y el ajo picados en la sartén durante aproximadamente un minuto.",
                "Baje el fuego y agregue el caldo de sopa de pollo y el caldo de sopa kombu dashi a la sartén. Llevar a ebullición",
                "Agrega la salsa de soja, el sake, el azúcar y la sal a la sopa y deja que hierva nuevamente.",
                "Mientras tanto, hierve agua en una olla grande. Agrega los fideos chukamen al agua hirviendo y cocina por unos minutos (sigue las instrucciones del paquete).",
                "Coloque un colador de malla fina sobre un bol y vierta la sopa a través del colador.",
                "Vierta la sopa caliente en tazones individuales.",
                "Escurre los fideos y agrégalos a la sopa caliente.",
                "Agregue aderezos, como algas negi y nori picadas, si lo desea. Espolvorea con pimienta al gusto.",

            ),
            imagenesPreparacion = listOf(R.drawable.paso1_ramenshoyuo, R.drawable.paso2_ramenshoyuo, R.drawable.paso3_ramenshoyuo, R.drawable.paso4_ramenshoyuo, R.drawable.paso5_ramenshoyuo, R.drawable.paso6_ramenshoyuo, R.drawable.paso7_ramenshoyuo, R.drawable.paso8_ramenshoyuo, R.drawable.paso9_ramenshoyuo),
            tiempo = "30 min",
            personas = 2,
            etapasIngredientes = listOf("", "", ""),
            etapasPreparacion = listOf("", "", "" )
        ),

        Plato(
            id = 6,
            imagen = R.drawable.makizushi_titulo,
            nombre = "Makizushi (rollo de atún japonés)",
            descripcion = listOf("Los rollos de sushi de ensalada de atún son largos rollos de sushi rellenos de ensalada de atún y envueltos en arroz y alga nori. Este estilo de rollo de sushi se conoce como makizushi o maki sushi, que significa sushi enrollado en japonés."),
            ingredientes = listOf("1 cucharada de cebolla finamente picada", "2/3 taza de atún enlatado", "1 cucharada de mayonesa", "1 pizca de sal", "1 cucharadita de mostaza picante japonesa (karashi), opcional", "4 hojas de nori (alga seca)", "6 tazas de arroz para sushi cocido", "Gari shoga (jengibre dulce encurtido), para decorar", "2 cucharaditas de semillas de sésamo tostadas y/o negras , opcional", "Salsa de soja, para servir"
                ),
            pasosPreparacion = listOf(
                "Reúne los ingredientes.",
                "Para hacer la mezcla de ensalada de atún, mezcle la cebolla picada, el atún, la mayonesa y la sal en un bol. Alternativamente, use su receta favorita de ensalada de atún . Si prefiere la ensalada de atún picante, agregue un poco de mostaza karashi a la mezcla de ensalada de atún.",
                "Cubra la estera de bambú con un trozo de plástico para evitar que las algas o el arroz perdido se peguen a la estera. Esto también facilita la limpieza. Coloque una hoja de nori encima de la estera de bambú.",
                "Unte 1/4 de porción de arroz para sushi encima de la hoja de nori. En el centro, extienda una línea de ensalada de atún horizontalmente sobre el arroz.",
                "Enrolle la estera de bambú, presionando hacia adelante para darle forma al sushi en un cilindro. Presiona firmemente la estera de bambú y retírala del sushi. Repite el proceso y haz más rollitos de ensalada de atún.",
                "Limpia un cuchillo con un paño húmedo antes de cortar sushi. Corta el rollo de sushi en trozos pequeños. Adorne con gari shoga y semillas de sésamo, si las usa, y sirva con salsa de soja.",
            ),
            imagenesPreparacion = listOf(R.drawable.paso1_makizushi, R.drawable.paso2_makizushi, R.drawable.paso3_makizushi, R.drawable.paso4_makizushi, R.drawable.paso5_makizushi, R.drawable.paso6_makizushi),
            tiempo = "30 min",
            personas = 4,
            etapasIngredientes = listOf(""),
            etapasPreparacion = listOf("")
        ),


        Plato(
            id = 7,
            imagen = R.drawable.rollitospicante_titulo,
            nombre = "Rollitos de atún",
            descripcion = listOf("Los rollos de atún picantes son un artículo omnipresente en American menús de sushi. El condimento que hace que el atún sea picante es ichimi togarashi , que se traduce como \"ají de un sabor\" y consta solo de ají rojo molido. Tiene un picante suave, similar al ají chipotle, y añade un toque extra agradable sin ser abrumadoramente picante. "),
            ingredientes = listOf("1/2 libra de atún grado sushi o atún grado sashimi, maguro", "1/2 libra de atún grado sushi o atún grado sashimi, maguro", "1/2 cucharadita de chile rojo seco molido , ichimi togarashi, al gusto", "4 hojas de nori", "6 tazas de arroz para sushi preparado", "6 tazas de arroz para sushi preparado",
                ),
            pasosPreparacion = listOf(
                "Reúne los ingredientes",
                "Pica el atún crudo en cubos pequeños con un cuchillo afilado. Combine con la mayonesa y el ichimi togarashi en un bol y mezcle.",
                "Coloque una hoja de nori encima de una estera de bambú y extienda 1/4 de porción de arroz para sushi encima de la hoja de nori, creando una capa uniforme. Deja una tira en la parte superior del nori descubierta para sellar el rollo. Espolvorea semillas de sésamo sobre el arroz para sushi.",
                "Vierta 1/4 de la mezcla de atún a lo largo sobre el arroz, formando una línea uniforme de relleno aproximadamente a 1/3 de la altura desde el fondo del nori.",
                "Enrolle la estera de bambú desde la parte inferior, presionando hacia adelante para darle forma al sushi en un cilindro.",
                "Presione firmemente la estera de bambú para sellarla y retirarla del sushi. Repite este proceso para hacer 3 rollos más",
                "Limpia un cuchillo con un paño húmedo antes de cortar sushi. Corta el sushi enrollado en trozos pequeños sobre una tabla de cortar",
                "¡Sirve inmediatamente y disfruta!"
            ),
            imagenesPreparacion = listOf(R.drawable.paso1_rollitopicante, R.drawable.paso2_rollitopicante, R.drawable.paso3_rollitopicante, R.drawable.paso4_rollitopicante, R.drawable.paso5_rollitopicante, R.drawable.paso6_rollitopicante, R.drawable.paso7_rollitopicante),
            tiempo = "20 min",
            personas = 4,
            etapasIngredientes = listOf(""),
            etapasPreparacion = listOf("")
        ),


        Plato(
            id = 8,
            imagen = R.drawable.tekkamaki_titulo,
            nombre = "Tekkamaki",
            descripcion = listOf("El tekkamaki o (rollitos de atún) utiliza atún crudo, que tiene un bonito color rojo en contraste con el arroz blanco. Se dice que el nombre tekka , \"hierro candente\", proviene de este color. Sólo necesitas un poquito de pescado para cada rollo."),
            ingredientes = listOf("4 hojas de nori", "4 onzas de  atún apto para sushi", "6 tazas de arroz para sushi preparado", "Salsa de soja y wasabi, para servir"
                ),
            pasosPreparacion = listOf(
                "Reúne los ingredientes.",
                "Corte el nori por la mitad a 4 x 7 1/2 pulgadas.",
                "Corte el atún en palitos largos y finos, de 1/2 pulgada de grosor y 7 1/2 pulgadas de largo.",
                "Coloque la estera de bambú para sushi sobre la superficie de trabajo con listones de bambú de izquierda a derecha, para que pueda alejarla de usted.",
                "Coloque una hoja de nori encima de la estera de bambú ( makisu ) con uno de los lados largos de las algas cerca del borde frontal de la estera (el borde cerca de usted).",
                "Unte aproximadamente 3/4 de taza de arroz para sushi sobre la hoja de nori.",
                "Coloque el atún horizontalmente sobre el arroz.",
                "Enrolle la estera de bambú, presionando hacia adelante para darle forma al sushi en un cilindro. Enrolle desde el extremo frontal del tapete, guiando con el tapete para sushi hacia el otro extremo.",
                "Apriete los rollos como si fueran pasteles , tirando de la estera para apretar y presionando la estera de bambú firmemente.",
                "Retire el rollo del tapete.",
                "Repita hasta que todos los rollos estén hechos.",
                "Freír las otras dos chuletas y luego servir con salsa tonkatsu y arroz. También puede cubrir con cebolletas picadas."
            ),
            imagenesPreparacion = listOf(R.drawable.paso1_tekkamaki, R.drawable.paso2_tekkamaki, R.drawable.paso3_tekkamaki, R.drawable.paso4_tekkamaki, R.drawable.paso5_tekkamaki, R.drawable.paso6_tekkamaki, R.drawable.paso7_tekkamaki, R.drawable.paso8_tekkamaki, R.drawable.paso9_tekkamaki, R.drawable.paso10_tekkamaki, R.drawable.paso11_tekkamaki, R.drawable.tekkamaki_titulo),
            tiempo = "",
            personas = 12,
            etapasIngredientes = listOf(""),
            etapasPreparacion = listOf("")
        ),


        )
}
