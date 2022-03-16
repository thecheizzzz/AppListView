package com.example.applistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Model>()
        val myList = listOf(
            Model(R.drawable.trung_luoc, "Trứng luộc", 5000),
            Model(R.drawable.tom_chien, "Tôm chiên", 15000),
            Model(R.drawable.rau_cai, "Rau cải", 20000),
            Model(R.drawable.thit_kho, "Thịt kho", 35000)
        )

        for (item in myList) {
            data.add(item)
        }
        val adapter = CustomAdapter(data)
        recyclerView.adapter = adapter

    }
}
