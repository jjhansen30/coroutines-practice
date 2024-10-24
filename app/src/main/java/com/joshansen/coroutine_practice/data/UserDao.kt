package com.joshansen.coroutine_practice.data

import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

interface UserDao {
    @Upsert
    suspend fun insertUser(user: UserEntity)

    @Query("SELECT * FROM user")
    suspend fun getUser(): Flow<List<UserEntity>>
}