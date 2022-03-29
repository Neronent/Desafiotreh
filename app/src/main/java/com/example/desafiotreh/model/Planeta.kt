package com.example.desafiotreh.model

class Planeta (nombre:String, satelites:Int, masa:Double, volumen:Double, distancia:Int,tipo_planeta:MutableList<String>) {

    init {
        println("Nombre: $nombre")
        println("Satelites: $satelites")
        println("Masa: $masa")
        println("Volumen: $volumen")
        println("Distancia: $distancia")
        println("Tipo de Planeta: $tipo_planeta")
    }

    fun densidad(masa:Double,volumen: Double):Double {
        return (masa*volumen)
    }

    fun esExterior(distancia: Int):String {
        if(distancia < 149597870) {
            return "No es exterior"
        } else {
            return "Es exterior"
        }
    }

}