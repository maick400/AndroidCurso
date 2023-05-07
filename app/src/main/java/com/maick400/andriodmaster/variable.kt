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


    var username:String? = null
    println(username?.length)



}


fun imprimirName(){
    println(name)
}

fun printLastname():Unit{
    println(lastname)
}

fun saludar(name:String = "newName", age:Int = 0): String {
    return "Hola $name, al parecer tienes $age años"

}



