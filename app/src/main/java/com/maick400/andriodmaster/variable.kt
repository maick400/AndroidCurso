package com.maick400.andriodmaster

import android.telephony.mbms.StreamingServiceInfo

//Comentarios en linea

/*
* Comentarios multilinea
*

* */
var name:String  = "Miguel Angel"
var lastname:String  = "Pina Paredes"

fun main(){

//    var fruits = arrayOf<String>( "apple", "orange", "pear", "banana")
//    var fruitsLongs = fruits.map{ fr ->
//        fr.length
//    }
//    println(fruits.toList() )
//    println(fruitsLongs)
//    println("fruits len: ${fruits.size}")
//    println("fruits len: ${fruitsLongs.size}")


//    var username:String? = null
//    var usernameLong:Int = username?.length?:0
//    println(usernameLong)



//    var emptyList = mutableListOf<Int>()
//    println(emptyList)
//    //agregar elementos
//    emptyList.add(12)
//    emptyList.add(2)
//    emptyList.add(4)
//    println(emptyList)
//
//    //modifica elementos
//    emptyList[0] = 55
//    println(emptyList)
//
//    //ELiminar elementos  elementos
//    emptyList.remove(4)
//    println(emptyList)

//    var person = mutableMapOf(
//        "age" to 32,
//        "tall"  to 23.1f,
//        "capacity" to mutableMapOf( "sensorial" to  23, "visual" to 0.23f)
//    )
//    println("Map original ${person}")
//
//    //Agregar elemento clave y valor
//    person.put("address", "Quevedo")
//    println("Map agregado el atributo address ${person}")
//
//    //Eliminar llave
//    person.remove("age")
//    println("Map eliminado el atributo age ${person}")
//
//    //Modificar llave
//    person["tall"] = 0.23f
//    println("Map modificado el atributo tall ${person}")
//



//    var vocals: MutableSet<Char> =mutableSetOf('a', 'b', 'c', 'a', 'b', 'd')
//    println(vocals)
//    vocals.add('z')
//    vocals.remove('a')
//    val resu1 = operar(10, 5, ::sumar)
//    println("La suma de 10 y 5 es $resu1")
//
//    val resu2 = operar(5, 2, ::sumar)
//    println("La suma de 5 y 2 es $resu2")
//
//    println("La resta de 100 y 40 es ${operar(100, 40, ::restar)}")
//
//    println("El producto entre 5 y 20 es ${operar(5, 20, ::multiplicar)}")
//
//    println("La división entre 10 y 5 es ${operar(10, 5, ::dividir)}")


    var colors:List<String> = listOf("yellow", "Green", "Red")

    with(colors){
        println("El numero de colores contenidos son ${size}")
        println("EL primer elemento es ${first()}")
        println("El elemento final es ${last()}")

    }
}


fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int {
    return fn(v1, v2)
}

fun sumar(x1: Int, x2: Int) = x1 + x2

fun restar(x1: Int, x2: Int) = x1 - x2

fun multiplicar(x1: Int, x2: Int) = x1 * x2

fun dividir(x1: Int, x2: Int) = x1 / x2

fun imprimirName(){
    println(name)
}

fun printLastname():Unit{
    println(lastname)
}


fun saludar(name:String = "default name", age:Int = 0): String {
    return if (age  != 0 ){
        "Hola $name, al parecer tienes $age años"
    }
    else {
        "Hola $name, al parecer ocurrió un error con tu edad"
    }

}






