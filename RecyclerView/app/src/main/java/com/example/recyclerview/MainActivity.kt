package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerview : RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageID : Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heading = arrayOf(
            "Volvo", "BMW", "Ford", "Mazda", "Volvo", "Volvo", "BMW", "Ford", "Mazda", "Volvo","Volvo", "BMW", "Ford", "Mazda", "Volvo"
        )
        imageID = arrayOf(
            R.drawable.b,
            R.drawable.a,
            R.drawable.b,
            R.drawable.b,
            R.drawable.a,
        )


        newRecyclerview = findViewById(R.id.recyclerView)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()

    }

    private fun getUserdata() {
        for(i in heading.indices){
            val news = News(heading[i])
            newArrayList.add(news)
        }
        newRecyclerview.adapter = MyAdapterS(newArrayList)
    }
}