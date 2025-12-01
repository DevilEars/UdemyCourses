package com.kotlinplayground.basics

fun main() {
    // val = immutable
    val name: String = "Beelzebub"
    println(name)

    // You can't do this here
//    name = Azagthoth;

    // var = variable, mutable
    var age: Int = 37
    println(age)
    age = 38
    println(age)

    // Kotlin type inference: it is not needed to declare the types explicitly
    val salary: Long = 300000L
    println(salary)

    val course = "Kotlin Spring"
    // String interpolation
    println("course: $course")
    // functions can also be executed here, eg
    println("course: $course and the course length is ${course.length}")

    val multiLine = "ABC \nDEF"
    println(multiLine)

    val fancyMultiLine = """
        ABC
        DEF
    """.trimIndent()
    println(fancyMultiLine)

}