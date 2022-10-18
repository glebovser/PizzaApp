package com.hviksor.pizzaapp.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PizzaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertPizzaInfo(pizzaDbModel: PizzaDbModel)

    @Query("SELECT * FROM pizza_product_info")
    fun getPizzaInfo(): LiveData<List<PizzaDbModel>>


}