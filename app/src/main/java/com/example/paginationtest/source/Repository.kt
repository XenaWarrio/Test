package com.example.paginationtest.source

import com.example.paginationtest.model.Country

class Repository {

    fun getList(): MutableList<Country> {
        return mutableListOf(
            Country("Ukraine"),
            Country("Russian"),
            Country("USA"),
            Country("Narnia"),
            Country("Great Britain"),
            Country("Italy"),
            Country("Spain"),
        )
    }
}
