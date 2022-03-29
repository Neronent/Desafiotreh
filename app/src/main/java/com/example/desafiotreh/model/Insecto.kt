package com.example.desafiotreh.model

class Insecto {

    private var longitud:Float = 0f
    private var color:String = ""
    private var tipoInsecto:String =""
    private var alas:Int = 0
    private var patas:Int = 0
    private var antenas:Int = 0

    fun getLongitud():Float {
        return longitud
    }
    fun getColor():String {
        return color
    }
    fun getTipoinsecto():String {
        return tipoInsecto
    }
    fun getAlas():Int {
        return alas
    }
    fun getPatas():Int {
        return patas
    }
    fun getAntenas():Int {
        return antenas
    }

    fun setLongitud( longitud:Float) {
        this.longitud = longitud
    }
    fun setColor(color:String) {
        this.color=color
    }
    fun setTipoinsecto(tipoInsecto:String) {
        this.tipoInsecto = tipoInsecto
    }
    fun setAlas(alas:Int) {
        this.alas = alas
    }
    fun setPatas(patas:Int) {
        this.patas = patas
    }
    fun setAntenas(antenas:Int) {
        this.antenas = antenas
    }

}