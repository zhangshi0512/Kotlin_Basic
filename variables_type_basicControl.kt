// variables before main function as top level variable
// top level variable can be updated under main function
// null cannot be a value of non-null type string
// var greeting: String = null will cause error
// var greeting: String? = null is allowed by adding ? after data type.
// data type + ? is called a nullable variable, without the ? will be a non-null variable, which cannot be assigned null later
val topname: String = "Nate"
var greeting: String? = "hello"

// introduction to functions
fun greeting(): String {
    return "Hello world return from greeting() function"
}

// single expression function
// the entire function is in single line condition
fun greetingAlternative() = "Hello world from equal without curly brackets"

fun greetingNull(): String? {
    return null
}

// unit in kotlin returns nothing useful, normally used for execution
// unit can be removed if we do not want to return anything
fun sayHello(itemToGreet:String): Unit {
    // two ways to construct a string:
    // 1. by concatenation
    val msg = "Hello " + itemToGreet + " from sayHello() execution"
    // 2. by pass in the variable using $ sign
    val msg2 = "Hello $itemToGreet by using $ sign"
    println(msg)
    println(msg2)
}

// the function above can be rewritten as a single line function
fun sayHelloSingleLine(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet from single line function")

fun main() {
    // println("Hello Kotlin")

    // uncomment the greeting value below null to see how it impacts the print result for greeting
    greeting = null
    // greeting = "hello updated in main()"
    if (greeting != null) {
        println(greeting)
    }else{
        println("Hi")
    }
    // when statement is similar to switch option in java
    when (greeting) {
        null -> println("Hi")
        else -> println(greeting)
    }

    // if statement to assign val value
    val greetingToPrintif = if (greeting != null) greeting else "If"
    println(greetingToPrintif)

    // when statement to assign val value
    val greetingToPrintwhen = when (greeting) {
        null -> "When"
        else -> greeting
    }
    println(greetingToPrintwhen)

    // val cannot be reassigned if assigned once
    // var can be reassigned as many times as you want
    var name: String = "Nate"
    name = "Simon"
    println(name)
    println(topname)

    println(greeting())
    println(greetingAlternative())
    println(greetingNull())

    sayHello(itemToGreet = "Kotlin")
    sayHelloSingleLine(greeting = "Hello", itemToGreet = "Kotlin")
}

