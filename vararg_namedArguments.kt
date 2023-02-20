fun sayHello(greeting:String, itemsToGreet:List<String>) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

// vararg allows to pass variable arguments to a function
// vararg allows passing comma separated arguments to a function
fun sayHello2(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

// the named arguments can be defined as default in function, in that case the program can run without filling arguments when called
// the named arguments can be filled in different order
fun greetPerson(greeting: String = "Hello", name: String = "Nate") = println("$greeting $name")

fun main() {
    // collections in Kotlin are immutable, cannot add or remove values from that collection once created
    // if we want a mutable collection, we need to use mutable functions to create collection

    // construct a simple array
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[1])
    println(interestingThings.get(0))

    // iterator functions
    // for loop
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }
    // can be rewritten as for each
    interestingThings.forEach {
        println(it) // 'it' is a default element from forEach function
    }

    interestingThings.forEach { interestingThing ->
        println(interestingThing) // 'it' can be rewritten as other variable name
    }

    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }

    // construct a immutable list
    val interestingThings2 = listOf("Kotlin", "Programming", "Comic Books")
    interestingThings2.forEach { interestingThing2 ->
        println(interestingThing2)
    }

    // construct a mutable list
    val interestingThingsMutable = mutableListOf("Kotlin", "Programming", "Comic Books")
    println(interestingThingsMutable)
    interestingThingsMutable.add("Dog")
    println(interestingThingsMutable)
    interestingThingsMutable.remove("Comic Books")
    println(interestingThingsMutable)

    // construct a immutable map
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key -> $value") }

    // construct an mutable map
    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mutableMap.put(4, "d")
    mutableMap.forEach { key, value -> println("$key -> $value") }

    sayHello(greeting="Hi", interestingThingsMutable)
    // vararg parameter
    // allows type in a series of string within the arguments brackets
    sayHello2(greeting="Hi", "Kotlin", "Programming", "Cat")
    // "*" need to be added in front of the array
    // vararg cannot be passed to an existing list
    sayHello2(greeting="Hello", *interestingThings)

    // named arguments
    greetPerson()
    greetPerson(greeting="Hi", name="Simon")

    // when using both vararg and named arguments, if one of the arguments is named, the following must be named as well.
    sayHello2(greeting = "Hi", itemsToGreet = *interestingThings)
}