package com.maick400.andriodmaster

//Comentarios en linea

/*
* Comentarios multilinea
*

* */
var name:String  = "Miguel Angel"
var lastname:String  = "Pina Paredes"

fun main(){

    var nombre:String = "ana"
    if (nombre == "Miguel"){
        println("usted tiene nombre largo")
    }
    else if (nombre == "ana"){
        println("usted tiene nombre corto")
    }
    else {
        println("Su nombre no es correcto")
    }


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


