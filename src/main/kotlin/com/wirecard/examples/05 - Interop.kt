@file:JvmName("Util")
package com.wirecard.examples

// Use this function in the Java class as Util.sayHello
fun sayHello(name: String) = "Hello, $name!"


// Implement and make it work in the Java class
@JvmOverloads
fun printList(start: Int, end: Int, step: Int = 1) {
    (start..end step step).forEach(::println)
}

object Greeter {
    // Is used in the Java class
    fun sayHello(name: String) = "Hello, $name!"
}
