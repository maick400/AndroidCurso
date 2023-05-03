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
when (){

}
```



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

**Concatenación**
***

```kotlin
var username:String = "maick400"
var edad:Int = 23

print ("Hola, mi nombre es $username y tengo $edad años")
```






