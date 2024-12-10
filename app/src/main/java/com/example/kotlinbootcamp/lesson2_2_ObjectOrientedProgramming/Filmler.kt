package com.example.kotlinbootcamp.lesson2_2_ObjectOrientedProgramming

data class Filmler(var id:Int, var adi:String, var fiyat:Double) {

    init {

    }

    fun bilgiAl(){
        println("Id    :${this.id}")
        println("Adi   :${this.adi}")
        println("Fiyat:${this.fiyat} ₺")
    }
}