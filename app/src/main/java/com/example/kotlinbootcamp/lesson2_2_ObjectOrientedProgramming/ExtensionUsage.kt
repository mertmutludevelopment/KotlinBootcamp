package com.example.kotlinbootcamp.lesson2_2_ObjectOrientedProgramming

fun main() {

    val sonuc= 5.carp(2)

    println(sonuc)
}

    infix fun Int.carp(sayi1:Int,): Int{
        return this*sayi1
    }