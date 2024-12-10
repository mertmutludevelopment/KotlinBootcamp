package com.example.kotlinbootcamp.lesson2_1_standartProgramming


fun main() {
    val yas=23
    val ad="mert"
    val ka="admin"
    val s= 123
    val sayi =123



    println( yas>= 18)

    if(yas >= 18){
        println("resit")
    }else{
        println("resit değil")
    }

    if(ka =="admin" && s ==1233){
        println("dogru")
    }else{
        println("hatali giris")
    }


    val x = 3

    when(x){
        1 -> println("sayı 1'dir")
        2 -> println("sayı 2'dir")
        else -> println("böyle bir sayı yok")

    }
}