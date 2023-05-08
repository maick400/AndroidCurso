# AndroidCurso
Este es el curso de 13 horas del kotlin del canal de "Programadores Android by AristiDevs" junto con los conceptos brindados en Platzi del "Curso básico de Kotlin" 

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

<h2 align="center"> <b> Listas  </h2>

***
## Listas inmutables 
Son aquellas que contienen elementos que no pueden ser modificadas a futuro, es decir, no se puede agregar ni eliminar elementos en ella. 

## Listas mutables
Este tipo de listas si admiten la agregacion. modificación y eliminación de sus elementos como se lo puede apreciar en el siguiente código: 
code 

```kotlin 
    var emptyList = mutableListOf<Int>()
    println(emptyList)
    //agregar elementos
    emptyList.add(12)
    emptyList.add(2)
    emptyList.add(4)
    println(emptyList)

    //modifica elementos
    emptyList[0] = 55
    println(emptyList)

    //ELiminar elementos  elementos
    emptyList.remove(4)
    println(emptyList)

```

output
```concsole  
[]
[12, 2, 4]
[55, 2, 4]
[55, 2]

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






<h2 align="center"> <b>Null Safety <span style="color: red;">?</span> </h2>

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


<h2 align="center"> <b>double bang <span style="color: red;">!!</span> </h2>

***
cuando una una variable es declarada, y se tiene la completa seguridad de que no será nula en ninguna circunstancia, se utilizar el duble bang, para poder acceder a esta o así mismo a sus propiedades, sin embargo, la utilización de este operador se considerado una mala práctica, por lo que no es muy recomendado. 


Cuando tenemos un valor dentro de la variable o propiedad de la misma, no existirá ningún error, tal cual lo podemos apreciar a continuación:

code 
```kotlin 
    var username:String? = "Miguel"
    println(username!!.length)
```
output
```console
6

Process finished with exit code 0

```

Por otra parte, ¿Qué pasaría si el valor de la variables es null?

code 
```kotlin 
var username:String? = null
println(username!!.length)
```
output
```console
Exception in thread "main" java.lang.NullPointerException
	at com.maick400.andriodmaster.VariableKt.main(variable.kt:28)
	at com.maick400.andriodmaster.VariableKt.main(variable.kt)

```
El acceder a una propiedad cuyo valor es nulo, precederá de una excepción, debido a la naturaleza de kotlin. Para ello, existe el operador `elvis`, el cual nos permite asignar valores predeterminados, en caso de que la variable sea nulla


 

<h2 align="center"> <b>Operador elvis  <span style="color: red;">?:</span>  </h2>

***

elvis operator (Llamado asi por el peinado de Elvis Presley y comparado con el signo de interrogación), es utilizado para minimizar los errores en la utilización de variable con contenido null, el cual asigna una valor predeterminado en caso de que la variable y/o propiedad de la misma, contenga un elemento `null`

code 
```kotlin 
var username:String? = null
var usernameLong:Int = username?.length?:0

println(usernameLong)
```
output
```console
0
```
Si no utilizaríamos el operador elvis para esta función, sin duda tendríamos una excepción de tipo null



<h2 align="center"> <b>Maps</h2>

***

Los maps en kotlin son una representación de "Objetos o diccionarios" que podemos encontrar en lenguajes de programación como JS o Python, respectivamente, los cuales están definidos por una clave y un valor, estos tipos de esructura de datos se dividen en maps mutables (Prestos a los cambios) e inmutables (Solo de lectura)

## Mutable Maps
code 
```kotlin
var person = mutableMapOf(
    "age" to 32,
    "tall"  to 23.1f,
    "capacity" to mutableMapOf( "sensorial" to  23, "visual" to 0.23f)
)
println("Map original ${person}")

//Agregar elemento clave y valor
person.put("address", "Quevedo")
println("Map agregado el atributo address ${person}")

//Eliminar llave
person.remove("age")
println("Map eliminado el atributo age ${person}")

//Modificar llave
person["tall"] = 0.23f
println("Map modificado el atributo tall ${person}")
```
output
```console
Map original {age=32, tall=23.1, capacity={sensorial=23, visual=0.23}}

Map agregado el atributo address {age=32, tall=23.1, capacity={sensorial=23, visual=0.23}, address=Quevedo}

Map eliminado el atributo age {tall=23.1, capacity={sensorial=23, visual=0.23}, address=Quevedo}

Map modificado el atributo tall {tall=0.23, capacity={sensorial=23, visual=0.23}, address=Quevedo}


Process finished with exit code 0

```
## Inmutables maps
Este tipo de datos posee cada uno de las métodos de un mutable map, excepto aquellos que puedan modificar las llaves y/o valor de ellos.
code 
```kotlin
//declaración
var person =MapOf(
    "age" to 32,
    "tall"  to 23.1f,
    "capacity" to MapOf( "sensorial" to  23, "visual" to 0.23f)
)

```

<h2 align="center"> <b>Sets</h2>
Los sets es una estrcutura de datos muy parecida a una lista, sin embargo, este tipo de variable no permite la redundancia de datos, es decir dentro de los datos, no puede existir dos valores repetidos. 

## Mutable set
```kotlin
var vocals =mutableSetOf('a', 'b', 'c', 'a', 'b', 'd')
println(vocals)
```

```console
[a, b, c, d]

Process finished with exit code 0

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

## Retorno condicional  (return if)

code
```kotlin
fun main(){
    println(saludar("mariana", 0))
}

fun saludar(name:String = "default name", age:Int = 0): String {
    return if (age  != 0 ){
        "Hola $name, al parecer tienes $age años"
    }
    else {
        "Hola $name, al parecer ocurrió un error con tu edad"
    }

}

```

Console:
```console

Hola mariana, al parecer ocurrió un error con tu edad

Process finished with exit code 0
```

<h2 align="center"> <b>lambda</h2>

*** 
Como en JS se posee las fuunciones anónimas, mismas que pueden ser declaradas como variables, esto también existe dentro de kotlin y asi mismo ejecutadas, este tipo de funciones anónimas son utilizadas de la siguiente manera: 

code 
```kotlin
    var divicionNums:(Int, Int) -> Float = {dividendo, divisor -> (dividendo/divisor).toFloat()
    }
    println(divicionNums(4,2))


println(divicionNums(4,2))
```

Console:
```console
2.0

Process finished with exit code 0
```
un dato importante es que la función map utiliza un map para la verificación y asignación de datos






<h2 align="center"> <b>Funciones de orden superior</h2>

***

Kotlin es un lenguaje orientado a objetos pero introduce características existentes en los lenguajes funcionales que nos permiten crear un código más claro y expresivo.

Una de las características del paradigma de la programación funcional son las funciones de orden superior.

Las funciones de orden superior son funciones que pueden recibir como parámetros otras funciones y/o devolverlas como resultados.

Veremos una serie de ejemplos muy sencillos para ver como Kotlin implementa el concepto de funciones de orden superior y a medida que avancemos en el curso podremos ver las ventajas de este paradigma.

Problema 1
Definir una función de orden superior llamada operar. Llegan como parámetro dos enteros y una función. En el bloque de la función llamar a la función que llega como parámetro y enviar los dos primeros parámetros.
La función retorna un entero.



code 
```kotlin
fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int {
    return fn(v1, v2)
}

fun sumar(x1: Int, x2: Int) = x1 + x2

fun restar(x1: Int, x2: Int) = x1 - x2

fun multiplicar(x1: Int, x2: Int) = x1 * x2

fun dividir(x1: Int, x2: Int) = x1 / x2


//llamado de funciones desde el main utilizando la funcion de orden mayor
fun main(parametro: Array<String>) {
    val resu1 = operar(10, 5, ::sumar)
    println("La suma de 10 y 5 es $resu1")

    val resu2 = operar(5, 2, ::sumar)
    println("La suma de 5 y 2 es $resu2")

    println("La resta de 100 y 40 es ${operar(100, 40, ::restar)}")

    println("El producto entre 5 y 20 es ${operar(5, 20, ::multiplicar)}")

    println("La división entre 10 y 5 es ${operar(10, 5, ::dividir)}")
}
```
output
```console
La suma de 10 y 5 es 15
La suma de 5 y 2 es 7
La resta de 100 y 40 es 60
El producto entre 5 y 20 es 100
La división entre 10 y 5 es 2

Process finished with exit code 0
```


Problema 2

Declarar una clase que almacene el nombre y la edad de una persona. Definir un método que retorne true o false según si la persona es mayor de edad o no. Esta función debe recibir como parámetro una función que al llamarla pasando la edad de la persona retornara si es mayor o no de edad.
Tener en cuenta que una persona es mayor de edad en Estados Unidos si tiene 21 o más años y en Argentina si tiene 18 o más años.


code 
```kotlin
class Persona(val nombre: String, val edad: Int) {
    fun esMayor(fn:(Int) -> Boolean): Boolean {
        return fn(edad)
    }
}

fun mayorEstadosUnidos(edad: Int): Boolean {
    if (edad >= 21)
        return true
    else
        return false
}

fun mayorArgentina(edad: Int): Boolean {
    if (edad >= 18)
        return true
    else
        return false
}

fun main(parametro: Array<String>) {
    val persona1 = Persona("juan", 18)
    if (persona1.esMayor(::mayorArgentina))
        println("${persona1.nombre} es mayor si vive en Argentina")
    else
        println("${persona1.nombre} no es mayor si vive en Argentina")
    if (persona1.esMayor(::mayorEstadosUnidos))
        println("${persona1.nombre} es mayor si vive en Estados Unidos")
    else
        println("${persona1.nombre} no es mayor si vive en Estados Unidos")
}
```


<h2 align="center"> <b>Función let</h2>

Las función let sirve como un verificador de varialble nullables, que ejecuta una lambda si y solo si la variable o en consecuencia sus propidades,ejecuta el bloque de código contenido dentro de las llaver 

code 

```Kotlin
var username:String? = "Miguel" 

username?.let{
    println("La variable username no es nula")
}
```
outline
```console 
La variable username no es nula

Process finished with exit code 0
```
La variable username en el caso presentado, es nulable, sin embargo, esta posee un valor no nulo, por ende, al utilizar la función let, verifica que el valor no sea nulo, para así ejecutar el código contenido dentro de las llaves. 

Ahora para evidenciar de mejor manera el funcionamiento de let, se procederá a asignar un valor null a la variable, omitiendo el código.

code 

```Kotlin
var username:String? = null

username?.let{
    println("La variable username no es nula")
}
```
outline
```console 

Process finished with exit code 0
```

<h2 align="center"> <b>Función with</h2>

***

La función with nos sirve para evitar la repetición del nombre de cierta varialble que va a ser utilizada con recurencia, en donde `this`es el objeto, y se puede acceder direcctamente a las propiedades y metodos, sin necesidad de colocar `nombreVariable.`

code 

```Kotlin
var colors:List<String> = listOf("yellow", "Green", "Red")

with(colors){
    println("El numero de colores contenidos son ${size}")
    println("EL primer elemento es ${first()}")
    println("El elemento final es ${last()}")

}
```
outline
```console 
El numero de colores contenidos son 3
EL primer elemento es yellow
El elemento final es Red

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






