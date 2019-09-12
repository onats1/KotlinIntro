package com.example.kotlinintro.randomKotlinPractices

import android.util.Log

class Iterations {

    companion object val TAG = Iterations::class.java.simpleName

    var computedString: String? = null

    fun testIterable(){

        computedString.let {
            it!!.length

            return@let ""
        }

    }

    var emptyString: String? = null
    
    var testLambda : (String) -> Int = {it.length}

    fun testIterable(name: String? , game: (String)-> Int? = testLambda){

        var gameInt: Int? = game("")

        emptyString = if (true)"" else "false"

        var somethingList = listOf("first", "second", "third", "fourth")
        for (some in somethingList){
            Log.d(TAG, some)
        }

    }



}