package com.example.kotlinbootcamp.lesson2_2_ObjectOrientedProgramming

fun main() {

    ucret(3,Konserve.BUYUK)

}

fun ucret(adet:Int, boyut:Konserve){

    when(boyut){
        Konserve.KUCUK -> println("Ücret : ${adet*22} ₺")
        Konserve.ORTA -> println("Ücret : ${adet*32} ₺")
        Konserve.BUYUK -> println("Ücret : ${adet*42} ₺")
    }
}