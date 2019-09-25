package com.example.kotlinintro.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking{

    val job = GlobalScope.launch {
        repeat(1000){
         //   delay(100)
            Thread.sleep(100)
            if(!isActive) return@launch
            print(".")
        }
    }

    delay(1500)

    job.cancelAndJoin()


    print("Done.")

}

suspend fun testFunction(){

}