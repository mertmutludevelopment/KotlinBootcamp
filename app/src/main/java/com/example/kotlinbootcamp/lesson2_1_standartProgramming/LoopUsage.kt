package com.example.kotlinbootcamp.lesson2_1_standartProgramming

fun main() {

    for(i in 1..3  ){
        println("deöngü 1 : $i")
    }

    for(a in 5..20 step 5){
        println("döngü 3: $a" )
    }

    for (a in 20 downTo 5 step 5){
        println("döngü 4: $a" )

    }
}