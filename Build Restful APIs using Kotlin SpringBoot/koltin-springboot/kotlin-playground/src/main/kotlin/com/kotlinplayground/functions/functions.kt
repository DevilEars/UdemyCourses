package com.kotlinplayground.functions

fun main(){
    printName("My Name")
    var result = addition(4, 3)
    println("Result is : $result")
    var result1 = addition_approach1(6, 9)
    println("Result approach 1 is : $result1")
}

// you can also define a function inline, like this
fun addition_approach1(x: Int, y:Int) = x + y

fun addition(x: Int, y: Int): Int {
    return x + y;
}

// return type of unit is like a void return type, ie when there is no return type
fun printName(name: String): Unit {
    println("Name is : $name")
}
