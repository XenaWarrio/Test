package com.example.paginationtest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.paginationtest.R
import com.example.paginationtest.source.Repository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CountryAdapter()
        val recycler = findViewById<RecyclerView>(R.id.recycler)

        recycler.adapter = adapter
        val repo = Repository()
        adapter.setCountries(repo.getList())
    }
}