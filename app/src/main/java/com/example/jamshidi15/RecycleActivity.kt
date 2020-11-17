package com.example.jamshidi15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)
        val rec = findViewById<RecyclerView>(R.id.RecycleView1)
        val rec1 = findViewById<RecyclerView>(R.id.RecycleView2)
        val list=generateList(51)
        val adapter = RecycleViewAdapter2(list)
        rec.adapter = adapter
        rec.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rec1.adapter = adapter
        rec1.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, true)
    }

    fun generateList(size: Int): List<NewList> {
        val list = ArrayList<NewList>()
        for (i in 0 until size) {
            val image = when (i % 5) {
                0 -> R.drawable.sun
                1 -> R.drawable.airplane
                2 -> R.drawable.moon
                3 -> R.drawable.bus
                4 -> R.drawable.cloud
                else -> R.drawable.came
            }
            val txtTitle = "Item $i"
            val txt2 = when (i % 5) {
                0 -> "sun"
                1 -> "plane"
                2 -> "moon"
                3 -> "bus"
                4 -> "cloud"
                else -> "unknow"
            }
            val items = NewList(image, txtTitle, txt2)
            list+=items
        }
        return list
    }
}