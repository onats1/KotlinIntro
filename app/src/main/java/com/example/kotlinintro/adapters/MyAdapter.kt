package com.example.kotlinintro.adapters

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinintro.R
import com.example.kotlinintro.extensions.showToast
import com.example.kotlinintro.models.Hobby
import kotlinx.android.synthetic.main.list_item.view.*

class MyAdapter() :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    constructor(context: Context, hobbies: List<Hobby>) : this(){
        this.context = context
        this.hobby = hobbies
    }

    lateinit var hobby: List<Hobby>
    lateinit var context: Context

    companion object val TAG: String = MyAdapter::class.java.simpleName

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {

        hobby.let {
            return hobby.size
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobby[position]

        holder.setHobbies(hobby, position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var item: Hobby? = null
        private var currentPosition: Int = 0

        init {

            itemView.setOnClickListener {

                item?.let{
                    context.showToast(item!!.hobby, duration = Toast.LENGTH_LONG)
                }

            }

            itemView.share_icon.setOnClickListener{

                // Question mark with let after it signifies that the content of the let block is only executed if the variable is not null
                item?.let {
                    val intent = Intent()
                    intent.type = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, item!!.hobby)
                    intent.type = "text/plain"

                    context.startActivity(Intent.createChooser(intent, "Select app:"))

                }


            }
        }

        fun setHobbies(hobby: Hobby?, position: Int) {

            for (x in 1..5){

            }

            hobby?.let {
                itemView.item_text.text = hobby.hobby
                this.item = hobby
                this.currentPosition = position
            }

        }
    }
}