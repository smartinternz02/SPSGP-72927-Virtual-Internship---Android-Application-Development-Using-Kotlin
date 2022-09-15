package com.akshaygpproject.groceryapp.UI

import com.akshaygpproject.groceryapp.Database.Entity.GroceryItems

interface DialogListener {
    fun onAddButtonClicked(item:GroceryItems)
}