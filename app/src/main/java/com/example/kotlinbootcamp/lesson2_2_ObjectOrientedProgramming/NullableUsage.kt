package com.example.kotlinbootcamp.lesson2_2_ObjectOrientedProgramming

fun main() {
    var yazi :String? = null

    yazi ="a"
    println(" TEST1 : ${yazi?.uppercase()}")

    println(" TEST2 : ${yazi!!.uppercase()}")

    yazi?.let{
        println(" TEST3 : ${yazi}")
    }
}