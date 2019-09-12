package com.example.kotlinintro.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinintro.Constants
import com.example.kotlinintro.R
import com.example.kotlinintro.randomKotlinPractices.Iterations
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        open_activity.setOnClickListener{
            val message: String = user_input.text.toString()

            val intent = Intent()

            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Please select app:"))
        }

        var iterations = Iterations()

        iterations.testIterable()

        iterations.testIterable("")

        open_recycler.setOnClickListener{

            val intent = Intent(this, HobbiesActivity::class.java)
            intent.putExtra(Constants.INTENT_TAG, user_input.text)
            startActivity(intent)

        }
    }


}
