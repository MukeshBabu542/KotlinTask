package com.example.ai37b

import androidx.compose.animation.scaleOut
import androidx.compose.runtime.sourceInformation

fun main(){
//    mutable
    var name : String = "Mukesh"
    name= "ram"
//    immutable
    val age : Int = 20

//    my name is mukesh and age is 20
    print("My name is " + name + "and age is" + age)

    println("My name is $name and age is $age")
    println("My name is ${name.uppercase()} and age is $age")

//    Array
    val age = arrayOf(10,20,30)
    age[2] = 50
    println(age[2])

// Array List
    val age1 = ArrayList<Int>()
    val age2 = arrayListOf<Int>(10,20,30)

    age1.add(5)
    age2.add(10)

//    For loop
    for (i in 0 .. 10 step 2){
        print(i)
    }
    for (i in 10 downTo 0){
        print(i)
    }

    val result = sum(a=10,b=20)
}
// Function
fun sum(a:Int,b:Int) : Int {
    return a+b;
}

fun login(username:String,password:String) : Unit{
//    unit is void
}