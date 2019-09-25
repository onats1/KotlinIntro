package com.example.kotlinintro.coroutines

import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class CoroutineTest {

    @Test
    fun simpleTest(){
        Assert.assertEquals(2, 1+1)
    }


    @Test
    fun coroutineTest() = runBlocking{

        Assert.assertEquals("Return works", doWork())
    }
}