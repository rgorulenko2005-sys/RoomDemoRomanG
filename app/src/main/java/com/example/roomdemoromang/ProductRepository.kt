package com.example.roomdemoromang

import androidx.lifecycle.MutableLiveData

class ProductRepository(private val productDao: ProductDao) {
    val searchResults = MutableLiveData<List<Product>>()
}