package com.kotlinplayground.basics

fun main(){
    for (i in 1..5){
        println("i in $i")

        if (i == 3) break
    }

    label()

    labelWithInnerLoop()

    println("End of File")
}

fun label(){
    // loop is a label, it can be called practically anything
    loop@  for (i in 1..5){
        println("i in label $i")

        if (i == 3) break@loop
    }
}

fun labelWithInnerLoop(){
    // loop is a label, it can be called practically anything
    loop@  for (i in 1..5){
        println("i in label with inner loop $i")

//        if (i == 3) break@loop
        innerloop@ for (j in 1..5){
            if (j == 2) break@innerloop // you can choose which label to break
            // you can also continue@loop for example
        }
    }

    // return means no further execution
    // you can also return@loop to make it explicit
    // TODO find some better examples for labels and return
    // the course is sparse here
}