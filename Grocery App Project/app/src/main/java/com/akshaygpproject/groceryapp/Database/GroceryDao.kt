package com.akshaygpproject.groceryapp.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.akshaygpproject.groceryapp.Database.Entity.GroceryItems

@Dao
interface GroceryDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item:GroceryItems)

    @Delete
    suspend fun delete(item: GroceryItems)

    @Query("SELECT * FROM grocery_items")
     fun getAllGroceryItems():LiveData<List<GroceryItems>>
}