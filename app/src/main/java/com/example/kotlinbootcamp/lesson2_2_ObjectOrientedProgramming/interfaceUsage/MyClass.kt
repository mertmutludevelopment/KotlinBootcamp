package com.example.kotlinbootcamp.lesson2_2_ObjectOrientedProgramming.interfaceUsage

class MyClass : MyInterface{
    override val degisken: Int = 10

    override fun func1() {
        println("func1 is working")
    }

    override fun func2(): String {
        return "Func2 is working"
    }
    
}