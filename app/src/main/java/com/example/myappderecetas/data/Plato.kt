package com.example.myappderecetas.data

import androidx.annotation.DrawableRes

data class Plato (
    val id: Int,
    @DrawableRes val imagen:Int,
    val nombre: String,
    val descripcion: List<String>,
    val ingredientes: List<String>,
    val pasosPreparacion: List<String>,
    val imagenesPreparacion: List<Int>,
    val tiempo: String,
    val personas: Int,
    val etapasIngredientes: List<String>,
    val etapasPreparacion: List<String>
)