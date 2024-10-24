package com.joshansen.coroutine_practice.data

import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

interface ShopDao {
    @Upsert
    suspend fun insertInventory(shop: ShopEntity)

    @Query("SELECT * FROM shop")
    suspend fun getShop(): Flow<List<ShopEntity>>
}