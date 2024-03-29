package com.wirecard.examples

fun main(args: Array<String>) {
    // Create an extension property for integers that gets the next odd number
     println(4.nextOdd)

    // Create an extension function that prefixes a string with "extreme "
     println("Biking".extreme())
}

val Int.nextOdd get() = if (isOdd(this)) this +1 else this + 1

fun isOdd(value: Int) = value % 2 != 0

fun String.extreme() = "extreme $this"
