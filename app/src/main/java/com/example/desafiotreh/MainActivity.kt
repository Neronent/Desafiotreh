package com.example.desafiotreh

import com.example.desafiotreh.model.*
import kotlin.math.PI

fun main(){

    var opc:Int
    var resul:Float
    var result:String

    println("1. Calcular el area de un triangulo")
    println("2. Calcular el area de un circulo")
    println("3. Calcular el salario")
    println("4. Palabras en ingles")
    println("5. Hora por teclado")
    println("6. Dia de la semana")
    println("7. Numeros enteros")
    println("8. Salario de trabajador 2.0")
    println("9. Multiplos")
    println("10. Numeros del 320 al 160")
    println("11. Tabla de multiplicar")
    println("12. Piramide")
    println("13. Operaciones")
    println("14. Datos personales")
    println("15. Promedio")
    println("16. Lambas")
    println("17. Numeros amigos :D")
    println("18. Elementos duplicados")
    println("19. Datos personales 2.0")
    println("20. Sub clases")
    println("21. Insecto")
    print("22. Dataclass\n-->")

    opc = readLine()!!.toInt()

    when(opc){
        1 -> {
            var base:Int
            var area:Int

            print("Ingrese la base del triangulo\n-->")
            base = readLine()!!.toInt()
            print("Ingrese el area del triangulo\n-->")
            area = readLine()!!.toInt()
            resul = AreaTriangulo(base,area)
            println("El resultado es: ${resul}")

        }

        2 -> {
            val radio:Int?
            print("Ingrese el radio del circulo\n-->")
            radio = readLine()!!.toInt()
            resul = AreaCirculo(radio)

            println("El resultado es: ${resul}")

        }

        3 -> {
            print("Ingrese las horas trabajadas en la semana\n-->")
            var hora:Float = readLine()!!.toFloat()
            resul = CalcularSalario(hora)

            println("El resultado es: ${resul}")

        }

        4 -> {
            print("Do\tHacer\n")
            print("Draw\tDibujar\n")
            print("Play\tJugar\n")
            print("Homework\tTarea\n")
            print("Eat\tComer\n")
            print("Save\tGuardar\n")
            print("Shirt\tCamisa\n")
            print("Table\tMesa\n")
            print("Fish\tPescado\n")
            print("Drink\tBeben\n")
        }

        5 -> {

            print("Ingrese la hora (Solo la hora, no los minutos)\n-->")
            var horita = readLine()!!.toInt()
            result = Reloj(horita)

            println("El resultado es: ${result}")

        }

        6 -> {
            print("Ingrese el numero del dia de la semana\n-->")
            var dia = readLine()!!.toInt()
            result = Dia_semana(dia)

            println("El resultado es: ${result}")

        }

        7 -> {
            var num = IntArray(3)
            for (i in (0 until 3)){
                print("Ingrese el valor del dato ${i}")
                num[i] = readLine()!!.toInt()
            }
            var tem=0
            for(i in (0 until 3-1)){
                for(j in (0 until 3-1)){
                    if(num[j]>num[j+1]){
                        tem=num[j]
                        num[j]=num[j+1]
                        num[j+1]=tem
                    }
                }
            }

            println("Numeros ordenados de forma ascendente")
            for (i in (0 until 3)){
                println(num[i])
            }
            println("Numeros ordenados de forma descendente")
            for (i in (3-1 downTo 0)){
                println(num[i])
            }

        }

        8 -> {
            print("Ingrese las horas trabajadas en la semana\n-->")
            var hora:Float = readLine()!!.toFloat()
            resul = CalcularSalario2(hora)

            println("El resultado es: ${resul}")
        }

        9 -> {

            var num:Int
            var j=1

            do {
                num = 5 * j
                println(num)
                j++
            }while(num<100)

        }

        10 -> {
            var inicio = 320

            for (i in (0 until 9)){
                println(inicio)
                inicio -= 20
            }

        }

        11 -> {
            print("Ingrese el numero que quiera su tabla\n-->")
            var numerito = readLine()!!.toInt()
            result = Tablita(numerito)

            print(result)
        }

        12 -> {
            print("Ingrese el numero de filas para la piramide\n-->")
            val filas = readLine()!!.toInt()

            for (i in 1..filas) {
                var numero = 1

                for (space in 1..filas - i ) {
                    print("  ")
                }

                for (j in 1..i) {
                    print("$numero ")
                    if (i != 1 && i == j) {
                        for(k in 1..j-1){
                            numero--
                            print("$numero ")
                        }
                    }
                    numero++
                }

                println()
            }
        }

        13 -> {
            var x:Int = 144
            var y:Int = 999

            println("Datos: $x y $y")
            println("Suma: ${x+y}")
            println("Resta: ${x-y}")
            println("Multiplicacion: ${x*y}")
            println("Division: ${x/y}")

        }

        14 -> {
            var nombre = "Josue"
            var direccion = "Anexo Villa Libertad"
            var telefono = "86581976"

            println("Nombre: ${nombre}\tDireccion: ${direccion}\t\tTelefono: ${telefono}")

        }

        15 -> {
            var numero:IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
            var suma = 0

            for (i in numero){
                suma += i
            }
            var promedio = suma/numero.size
            println("La suma es de: ${suma} y El promedio es de: ${promedio}")

        }

        16 -> {

            val suma = operar(10,30,20, {x,y,z -> x+y+z})
            println("Suma: $suma")
            val producto = operar(10,30,20, {x,y,z -> x*y*z})
            println("Producto: $producto")
            val promedio = operar(10,30,20,{x,y,z -> (x+y+z)/3 })
            println("Promedio: $promedio")

        }

        17 -> {

            var suma = 0
            var x = 1

            print("Ingrese el valor del numero 1\n-->")
            var num1 = readLine()!!.toInt()
            print("Ingrese el valor del numero 2\n-->")
            var num2 = readLine()!!.toInt()

            while (x < num1) {
                if (num1 % x == 0){
                    suma += x
                }
                x++
            }

            if (suma == num2) {
                println("Los numeros son amigos")
            } else {
                println("Los numeros no son amigos")
            }


        }

        18 -> {
            var arreglo:IntArray = intArrayOf(1,2,3,3,4,4,5,2)
            var duplicado:Int
            var contador:Int
            val lista = mutableListOf<Int>()
            var i = 0

            for(i in 0..arreglo.size-1){
                println("Elemento[${i}]: ${arreglo[i]}")
            }

            //duplicado = 2
            //arreglo[i] = 2
            //arreglo[k] = 2
            while(i < arreglo.size){
                duplicado = arreglo[i]
                contador=0
                for (k in 0..arreglo.size-1){
                    if(arreglo[i] == arreglo[k]){
                        contador++
                        if(contador >= 2){
                            if(duplicado in lista == false){
                                lista.add(duplicado)
                            }
                        }
                    }
                }
                i++
            }
            i=0

            while (i < lista.size){
                println("El elemento duplicado: ${lista[i]}")
                i++
            }

        }

        19 -> {

            Persona(apellido = "Mena", nombre = "Felix", sexo = 'M', anioNac = "12/09/2002", cedula = "0011245783698R")

        }

        20 -> {

            val triangulo = Triangulo("Figura1: Triangulo",20.0,10.0)
            println(triangulo.printName())
            println("Base: ${triangulo.base}\nAltura: ${triangulo.altura}\nArea: ${triangulo.area()}")
            val rectangulo = Rectangulo("Figura2: Rectangulo", 25.0,26.0)
            println(rectangulo.printName())
            println("Base: ${rectangulo.base}\nAltura: ${rectangulo.altura}\nArea: ${rectangulo.area()}")
            val cuadrado = Cuadrado("Figura3: Cuadrado",25.0)
            println(cuadrado.printName())
            println("Lado: ${cuadrado.lado}\nArea: ${cuadrado.area()}")
            val circulo = Circulo("Figura4: Circulo",26.0)
            println(circulo.printName())
            println("Radio: ${circulo.r}\nArea: ${circulo.area()}")

        }

        21 -> {
            var longitud:Float
            var color:String
            var tipoInsecto:String
            var alas:Int
            var patas:Int
            var antenas:Int

            var insecto = Insecto()
            print("Ingrese la longitud del insecto\n-->")
            longitud = readLine()!!.toFloat()
            insecto.setLongitud(longitud)
            print("Ingrese la cantidad de alas del insecto\n-->")
            alas = readLine()!!.toInt()
            insecto.setAlas(alas)
            print("Ingrese la cantidad de patas del insecto\n-->")
            patas = readLine()!!.toInt()
            insecto.setPatas(patas)
            print("Ingrese el color del insecto\n-->")
            color = readLine()!!.toString()
            insecto.setColor(color)
            print("Ingrese la cantidad de antenas del insecto\n-->")
            antenas = readLine()!!.toInt()
            insecto.setAntenas(antenas)
            print("Ingreso el tipo de Insecto\n-->")
            tipoInsecto = readLine()!!.toString()
            insecto.setTipoinsecto(tipoInsecto)

            println("\nLongitud: ${insecto.getLongitud()}")
            println("Alas: ${insecto.getAlas()}")
            println("Patas: ${insecto.getPatas()}")
            println("Color: ${insecto.getColor()}")
            println("Antenas: ${insecto.getAntenas()}")
            println("Tipo de Insecto: ${insecto.getTipoinsecto()}")

        }

        22 -> {
            var profesor:String
            var materia:String
            var laboratorios:Int
            var conferencias:Int

            print("Ingrese el nombre del profesor\n-->")
            profesor = readLine()!!.toString()
            print("Ingrese el nombre de la materia\n-->")
            materia = readLine()!!.toString()
            print("Ingrese el numero de laboratorios\n-->")
            laboratorios = readLine()!!.toInt()
            print("Ingrese el numero de conferencias\n-->")
            conferencias = readLine()!!.toInt()

            var clase = Clase(profesor,materia,laboratorios,conferencias)

            println("\nNombre profesor: ${clase.profesor}")
            println("Nombre materia: ${clase.materia}")
            println("Numero de laboratorios: ${clase.laboratorios}")
            println("Numero de conferencias: ${clase.conferencias}")

        }

        else -> println("Ingrese un valor de 1 a 22")

    }


}

fun AreaTriangulo (base:Int, altura:Int): Float {
    val area = (base.toFloat()*altura.toFloat())/2
    return (area)
}

fun AreaCirculo (radio:Int):Float {

    val resul = (radio.toFloat() * radio.toFloat()) * PI
    return resul.toFloat();

}

fun CalcularSalario (hora:Float): Float{

    return (hora*12)

}

fun Reloj (horita:Int): String {

    if(horita >= 6 && horita <= 12){
        return "Buenos Dias"
    } else if (horita > 12 && horita < 20) {
        return "Buenas Tardes"
    } else {
        return "Buenas Noches"
    }

}

fun Dia_semana (dia:Int): String {

    when(dia){
        1 -> return "Lunes"
        2 -> return "Martes"
        3 -> return "Miercoles"
        4 -> return "Jueves"
        5 -> return "Viernes"
        6 -> return "Sabado"
        7 -> return "Domingo"

        else -> return "Dato incorrecto"

    }

}

fun CalcularSalario2 (hora:Float): Float{

    if (hora <= 40){
        return (hora*12)
    } else {
        return (hora*16)
    }

}

fun Tablita (num:Int):String {
    var operacion = ""
    var numerito = 1
    for (i in 1..12){
        operacion += "${num} * ${numerito} = ${num*i}\n"
        numerito++
    }
    return operacion

}

fun operar(var1: Int, var2: Int, var3: Int, fn: (Int, Int, Int) -> Int) : Int{
    return fn(var1, var2, var3)
}
