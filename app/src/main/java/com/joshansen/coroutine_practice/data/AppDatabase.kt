package com.joshansen.coroutine_practice.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ShopEntity::class, UserEntity::class],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract val shopDao: ShopDao
    abstract val userDao: UserDao
}