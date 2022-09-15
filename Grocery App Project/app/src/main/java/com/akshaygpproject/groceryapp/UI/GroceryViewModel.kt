package com.akshaygpproject.groceryapp.UI

import androidx.lifecycle.ViewModel
import com.akshaygpproject.groceryapp.Database.Entity.GroceryItems
import com.akshaygpproject.groceryapp.Database.GroceryRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repository: GroceryRepository):ViewModel() {

     fun insert(item:GroceryItems) = GlobalScope.launch {
        repository.insert(item)
    }
    fun delete(item: GroceryItems) = GlobalScope.launch {
        repository.delete(item)
    }
    fun allGroceryItems() = repository.allGroceryItems()


}