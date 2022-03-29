package com.example.desafiotreh.model

import kotlin.math.PI

abstract class Figura (val nombre:String) {
    abstract fun area():Double

    fun printName() {
        println(nombre)
    }

}

class Triangulo (nombre:String, var base:Double, var altura:Double): Figura(nombre) {
    override fun area() = (base*altura)/2
}

class Rectangulo (nombre: String, var base:Double, var altura:Double): Figura(nombre) {
    override fun area() = base*altura
}

class Circulo (nombre: String, var r:Double): Figura(nombre) {
    override fun area() = PI * (r*r)
}

class Cuadrado (nombre: String, var lado:Double): Figura(nombre) {
    override fun area() = lado*lado
}