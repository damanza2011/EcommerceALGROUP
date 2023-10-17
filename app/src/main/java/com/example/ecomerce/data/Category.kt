package com.example.ecomerce.data

sealed class Category(val category: String) {

    object FiltroAceite: Category("Filtro Aceite")
    object FiltroAire: Category("Filtro Aire")
    object FiltroCabina: Category("Filtro Cabina")
    object FiltroCombustible: Category("Filtro Combustible")
}