package com.example.kotlinintro.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {

    GlobalScope.launch {
        delay(1000)
        println("World!")
    }

    print("Hello ")

    delay(1500)

    doWork()
}

suspend fun doWork(): String{
    print("suspend function works.")
    delay(1000)
    return "Return works"
}