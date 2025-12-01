package com.kotlinplayground.basics

fun main() {

    var name = "Alex"// 4 chars
//    name = "Chloe"// 5 chars
    // if-else
    val result = if (name.length == 4) {
        println("Name $name is four characters")
        // you can do this too: no strong typing:
//        name
        name.length
    } else {
        println("Name $name is not four characters")
        // if-else expression always evaluates to last result
        name.length
    }

    println("result : $result")

    // 1 -> GOLD, 2 -> SILVER, 3 -> BRONZE
    val position = 1

//    val medal = if (position == 1) {
//        "GOLD"
//    } else if (position == 2) {
//        "SILVER"
//    } else if (position == 3){
//        "BRONZE"
//    } else {
//        "No medal"
//    }

    // when is like a switch with syntactic sugar
//    val medal = when (position) {
//        1 -> {
//            "GOLD"
//        }
//        2 -> {
//            "SILVER"
//        }
//        3 -> {
//            "BRONZE"
//        }
//        else -> {
//            "No medal"
//        }
//    }

    // no need for the brackets either
    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "No medal"
    }
    println(medal)

}