package br.com.exemplo.catalogodelivros

data class Livro(
    val id: Int,
    val titulo: String,
    val autor: String,
    val genero: String,
    val status: String
)