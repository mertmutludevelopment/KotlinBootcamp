package com.example.kotlinbootcamp.lesson2_2_ObjectOrientedProgramming

class Fonksiyonlar {
    lateinit var text:String

    fun selam1(){
        val sonuc="merhaba mert 1"
        println(sonuc)
    }


    fun selam2(): String{
        val sonuc="merhaba mert 2"
        return sonuc
    }

    fun selam3(ad:String) :String{
        return ad
    }

    fun topla(sayi1:Int, sayi2:Int){
        println(sayi1+sayi2)
    }

    fun topla(sayi1:Double, sayi2:Double){
        println(sayi1+sayi2)
    }

    fun topla(sayi1:Double, sayi2:Double, isim:String){
        println("$isim ${sayi1+sayi2}")
    }



}