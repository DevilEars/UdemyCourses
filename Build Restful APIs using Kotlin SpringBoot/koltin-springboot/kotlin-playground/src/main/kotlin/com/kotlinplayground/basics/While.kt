package com.kotlinplayground.basics

fun main(){
    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("do while: Value of i is : $i")
        i++
    } while (i < 5)
}


fun exploreWhile() {
    var x = 1;
    while (x < 5){
        println("while: Value of x is : $x")
        x++
    }
}
