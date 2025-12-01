package com.kotlinplayground.basics

fun main(){
    // typing this: val range = 1..n
    // will automatically generate a range like this:
    val range = 1..10
    for (i in range){
        println("range i : $i")
    }

    // counting down
    // typing this: val reverseRange = 10 downTo 1
    // will automatically generate a countdown range like this:
    val finalCountdownReverseRange = 10 downTo 1
    for (i in finalCountdownReverseRange){
        println("reverse range : $i")
    }

    // to skip values, provide a step size
    for (i in finalCountdownReverseRange step 2){
        println("reverse range with skip/step size: $i")
    }


}