# AndroidCurso
Este es el curso de 13 horas del kotlin del canal de "Programadores Android by AristiDevs"

<h2 align=center>
<b>Variables
</h2> 

***
Existen como en todos ciertos tipos de variables en el Kotlin, las cuales son:

**val:**  la sintaxsis para declarar una variable en kotlin esta determinada por la siguiente sintaxis " val < nombreDeVariable > :  < Tipo de datp>" Ejemplo: 

```kotlin
val edad:Int
var edad:Int

```

### **Numéricas**
***
**Int:** Varibles enteras 
```kotlin
val edad:Int = 22
var dia:Int = 7



```

**Long** Variables enteras mas amplias mayores al limite Int
```kotlin
val numeroDeEstrellas:Long = 2313952374232
var numeroDepiedras:Long = 2313952374232

```

**Float** Numeros decimales y soporta hasta 6 decimales 
```kotlin
val precio:Float = 23.23f
var cantidad:Float = 19.2f
```

**Double:** Similares a los Float, adeas que soporta hasta 14 decimales, sin embargo, no es necesario colocar una "f" al final de la asignacion.

```kotlin
val precio:Double = 23.23
var cantidad:Double = 19.2
```

### **Alfanuméricas**
***
**Char:** Solo un caracter es soportado, ya sea numerico o no.

```kotlin
val letra:Char = 'x'
var numero:Char = '1'

```

**String:** Cadena de caracteres alfanuméricos.
```kotlin
val saludo01:String = "hola a maick400"
var saludo:String = "hola a maick400"

```

### **boleanas**
***
**true/false** Utilizadas para operaciones lógicas
```kotlin
val activo:Boolean = false 
var activo:Boolean = true 

```


<h2 align="center"> <b>Condicionales </h2>

***
Dentro del lenjuage de programación se utilizan distintas sintaxis para operaciones logica, la cuales son:

## **If/else**
La estructuta para esta sentencia es la siguiente:
```kotlin
var nombre:String = "Miguel"
if (nombre == "Miguel"){
    println("usted tiene nombre largo")
}
else if (nombre == "ana"){
        println("usted tiene nombre corto")
}
else {
        println("Su nombre no es correcto")
}
```
Como se puede apreciar en el código, se evalua la variable nombre, en donde se puede ver la anidación de if, sin embargo, esta practica no es la mejor a seguir, es por eso que, para evitar dicha practica, esiste una estructura de control llamada "when".

## **when**
Esta estrututa ayuda a evitar la anidación de if, y su estructura es la siguente: 
```kotlin
var nombre:String = "Miguel"
when (nombre){
    "Miguel" ->     println("usted tiene nombre largo")

    "Juan" ->     println("usted tiene nombre corto")

    "Angélica" ->     
    {
        println("usted tiene nombre largo")
        println("usted es mujer")
    }

    else -> {
        println("usted no tiene nombre")
        println("su sexo no ha sido determinado")

    }

}
```

<h2 align="center"> <b>Ciclo for </h2>

Para iterar una variable, de utiliza el ciclo for en donde utilizamos ` for(element of iterableVariable)`

code
```kotlin 
var fruits = arrayOf<String>( "apple", "orange", "pear", "banana")
for (fruit in fruits){
    println(fruit)
}
```

output
```console 
apple
orange
pear
banana

Process finished with exit code 0


```

<h2 align="center"> <b>Ciclo foreach </h2>

Esta es una extensión de for en donde los elementos iterable poseen la funcion `forEach`

code
```kotlin 
var fruits = arrayOf<String>( "apple", "orange", "pear", "banana")
fruits.forEach( fruit -> println("In the store there's $fruit "))

```
output
```console 
In the store there's apple 
In the store there's orange 
In the store there's pear 
In the store there's banana 

Process finished with exit code 0
```

<h2 align="center"> <b>Ciclo forEachIndexed </h2>


Esta instrucción realmente es muy util para realizar distintos tipos deiteraciones de una manera mas simplificada, sin embargo, muchas veces es necesario saber el `indice del ciclo`, para ellos existe un tipo de foreach que lo realiza, siendo este: `forEachIndexed` que la diferencia con el el foreach común, es que tenemos una variable adicional de salida a la cual podemos llanar index. 

Code
```kotlin 
  var fruits = arrayOf<String>( "apple", "orange", "pear", "banana")
    fruits.forEachIndexed(){ index, fruit ->
        println("Product code: ${index} , ")
        println("name: $fruit \n ")
    }


```

```console 

Product code: 0 , 
name: apple 
 
Product code: 1 , 
name: orange 
 
Product code: 2 , 
name: pear 
 
Product code: 3 , 
name: banana 

```







<h2 align="center"> <b>Arrays </h2>

***
Los arrays en kotlin se especifican con `arrayOf()<DataType>`en donde serán especificados cada uno de los elementos iterables del areglo en cuestión. 

Ejemplo: 

```kotlin 
//declaración de un arreglo en donde se especifica el  tipo de dato
var weekDays = arrayOf<Int>( 1 , 2 , 32 , 235 , 1 , 4 )

//declaración de un arreglo en donde el lenguaje dectecta el tipo de dato de sus elementos (Arreglo de cadenas de texto para el caso siguiente)

var weekDays = arrayOf("Monday", "Tuesday", "Wenesday", "thursday","friday", "saturday", "sunday")

```

para poder acceder a cada uno de los elementos, podemos hacerlo mediante su índice, mismo que inicia el la posición `0` como se lo muestra en la siguiente sección de código.  

code
```kotlin 
var weekDays = arrayOf("Monday", "Tuesday", "Wenesday", "thursday","friday", "saturday", "sunday")

println(weekDays[0])
```

output
```console 
Monday

Process finished with exit code 0

```

## suma de arrays 
La suma de funciones se dan entre dos o mas arreglos del mismo tipo de elementos, en donde si existen elementos repetidos, serán agregados al arreglo total.

code 
```kotlin 
var evenNums = arrayOf(0, 2, 4, 6, 8)
var oddNums = arrayOf(1, 3, 5, 7, 9)

var decimalSystem = evenNums + oddNums

println(decimalSystem.size)
```

output

```console 
10

Process finished with exit code 0

```


<h2 align="center"> <b> map y filter  </h2>

***

## **map**
la función map está establecida dentro de cada iterable, el cual devuelve una lista de un tipo igual o diferente al del elemento que se está iterando (segun la operación devuelta dentro de las llaves), sin condición de por medio, siendo esta razón que el resultado de la operación tiene la misma longitud que el arreglo del cual se está recorriendo.´



code 
```kotlin 
    var fruits = arrayOf<String>( "apple", "orange", "pear", "banana")
    var fruitsLongs = fruits.map{ fr ->
        fr.length
    }
    //se agrega el toList() puesto que en consola no se puede visualizar un array completo sin ser transformado a una lista

    println(fruits.toList() )
    //Caso distinto con la variable fruitsLongs, que al ser creada por la función map, y al devolver una lista, esta puede ser impresa sin problema alguno

    println(fruitsLongs)

    println("fruits len: ${fruits.size}")
    println("fruits len: ${fruitsLongs.size}")

  

```

output
```console 
   [apple, orange, pear, banana]
[5, 6, 4, 6]
fruits len: 4
fruits len: 4

Process finished with exit code 0

```






<h2 align="center"> <b>Null Safety (?) </h2>

***
Es uno de los valores primordiales en kotlin, puesto que el lenguaje de programación de forma predeterminada, no permite valores nullos, como lo podemos visualizar en la siguiente codifiacación: 

code 
```kotlin 
    var username:String = null 
```

output
```console 
Null can not be a value of a non-null type String

```

Para poder utilizar valores nulos, existe  los `safe calls`el cual es representado por el signo `?` 
este operador nos ayuda al momento de escribir nuestro código, evitando posibles errores, debido la posibilidad de que una variable posea un valor `null`

mismo que es utilizado de la siguiente manera:


code 
```kotlin 
    var username:String? = null
    println(username?.length)
```
output
```console
null  
```


<h2 align="center"> <b>double bang(!!) </h2>

***
cuando una una variable es declarada, y se tiene la completa seguridad de que no será nula en ninguna circunstancia, se utilizar el duble bang, para poder acceder a esta o así mismo a sus propiedades, sin embargo, la utilización de este operador se considerado una mala práctica, por lo que no es muy recomendado. 








<h2 align="center"> <b>Métodos y funciones </h2>

***




Las funciones son especificades con la palabra reservada fun. De manera predeterminada, kotlin usa un retorno de tipo "Unit" (void en lenguajes como Java y C#)

## **Funciones vacias (Métodos)**
```kotlin
var name:String  = "Miguel Angel"
var lastname:String  = "Pina Paredes"


//Funcion sin retorno de dato (Unit) implicito
fun printName(){
    println(name)
}

//Funcion sin retorno de dato (Unit) Explicito
fun printLastname():Unit{
    println(lastname)
}

fun main(){
    printName()
    printLastname
}

```
Console:
```console
Miguel Angel
Pina Paredes

Process finished with exit code 0
```


## **Funciones con retorno (Fuciones)**
```kotlin
fun main(){
    printName()
    printLastname
}

fun saludar(name:String = "default name", age:Int = 0): String {
    return "Hola $name, al parecer tienes $age años"

}



```
Console:
```console

Process finished with exit code 0
```






<h2 align="center"> <b>Utilidades </h2>

***





## Convercíon de variables
***
Para la conversion (cast) o cambio de tipo de dato en kotlin, se utiliza al final de cada variable la sintaxis " To< Tipo de dato>"

Ejemplo:

```kotlin
var cantidad1:Int = 12 
var cantidad2:Float = 23.12f

var totalCantidades:Double = cantidad1.toDouble() + cantidad2.toDouble()


```




## **Comandos de utilidad**

**Verificar tipo de dato**
***
```kotlin
var year:Int = 2023
println(year is Int)
println(year is Float)
```

Consola
```console
true
false
Process finished with exit code 
```

**Generar Números aleatorios**
***
```kotlin
var aleatorio = (0..100).random()
println(aleatorio)
```

Consola
```console
22
```

**Concatenación**
***

```kotlin
var username:String = "maick400"
var edad:Int = 23

print ("Hola, mi nombre es $username y tengo $edad años")
```






