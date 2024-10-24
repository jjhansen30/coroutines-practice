package com.joshansen.coroutine_practice.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop")
data class ShopEntity(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "name") val shopName: String,
    @ColumnInfo(name = "inventory") var inventory: List<GameItem>
)
