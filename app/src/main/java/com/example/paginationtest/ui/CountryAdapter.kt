package com.example.paginationtest.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.paginationtest.R
import com.example.paginationtest.model.Country
import com.example.paginationtest.ui.diffUtil.CountryDiffCallback

class CountryAdapter : RecyclerView.Adapter<CountryViewHolder>() {
    private var list = mutableListOf<Country>()

    fun setCountries(newList: MutableList<Country>) {
        val result = DiffUtil.calculateDiff(CountryDiffCallback(list, newList))

        list.clear()
        list = newList

        result.dispatchUpdatesTo(this)
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