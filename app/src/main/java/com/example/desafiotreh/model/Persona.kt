package com.example.desafiotreh.model

class Persona (var nombre:String, var apellido:String, var cedula:String, var sexo:Char, var anioNac:String) {

    init {
        println("Nombre: $nombre")
        println("Apellido: $apellido")
        println("Cedula: $cedula")
        println("Sexo: $sexo")
        println("Anio de Nacimiento: $anioNac")
    }



}