package com.example.kotlinintro.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinintro.adapters.MyAdapter
import com.example.kotlinintro.R
import com.example.kotlinintro.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    companion object{
        val TAG: String = HobbiesActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setRecycler()
    }

    private fun setRecycler() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter =
            MyAdapter(this, Supplier.hobbyList)    }

}