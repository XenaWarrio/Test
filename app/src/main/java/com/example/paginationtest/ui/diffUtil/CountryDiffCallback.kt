package com.example.paginationtest.ui.diffUtil

import androidx.recyclerview.widget.DiffUtil
import com.example.paginationtest.model.Country

class CountryDiffCallback(private val oldList: List<Country>, private val newList: List<Country>) :
    DiffUtil.Callback() {
    override fun getOldListSize() = oldList.size


    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        oldList[oldItemPosition] == newList[newItemPosition]


    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val countryOldList = oldList[oldItemPosition].name
        val countryNewList = newList[newItemPosition].name

        return countryNewList == countryOldList
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        return super.getChangePayload(oldItemPosition, newItemPosition)
    }
}