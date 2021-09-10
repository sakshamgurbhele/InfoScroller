package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.AppCompatImageView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapterS(private val newsList : ArrayList<News>) : RecyclerView.Adapter<MyAdapterS.MyviewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {

        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyviewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.heading.text = currentItem.heading
        holder.myimage.setImageResource(currentItem.myimage)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    class MyviewHolder(ItemView : View) : RecyclerView.ViewHolder(ItemView){

        val heading : TextView = itemView.findViewById(R.id.heading)

        var myimage : ShapeableImageView = itemView.findViewById(R.id.myimage)

    }

}