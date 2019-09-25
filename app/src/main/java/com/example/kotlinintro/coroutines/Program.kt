package com.example.kotlinintro.coroutines

import android.provider.Settings
import kotlinx.coroutines.*
import java.lang.Thread.sleep
import java.util.concurrent.atomic.AtomicInteger

fun main(){

    var num = AtomicInteger()

    for(i in 1..1_500_000){
        GlobalScope.launch {
            num.getAndIncrement()
        }
    }

  //  sleep(1500)
    println("World!")
    println(num.get())


    /*  thread {
          sleep(1000)
          print("World!")
      }

      print("Hello ")

      sleep(1500)*/

}


