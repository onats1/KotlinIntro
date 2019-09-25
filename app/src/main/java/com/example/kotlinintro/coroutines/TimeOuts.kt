package com.example.kotlinintro.coroutines

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.yield

fun main() = runBlocking{

    val job = withTimeout(100){
        repeat(1000){
            yield()
            print(".")
            Thread.sleep(1)
        }

    }




}