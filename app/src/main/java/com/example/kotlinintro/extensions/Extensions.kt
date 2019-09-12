package com.example.kotlinintro.extensions

import android.content.Context
import android.widget.Toast

//inserting a function into an existing class
fun Context.showToast(text: String, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, text, duration).show()
}