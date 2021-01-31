package com.example.paginationtest.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.paginationtest.R
import com.example.paginationtest.model.Country

class CountryAdapter : RecyclerView.Adapter<CountryViewHolder>() {
    private var list = mutableListOf<Country>()

    fun setCountries(list: MutableList<Country>) {
        this.list = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.country, parent, false)

        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.count()
}

class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(c: Country) {
        itemView.findViewById<TextView>(R.id.tv_country).text = c.name
    }
}