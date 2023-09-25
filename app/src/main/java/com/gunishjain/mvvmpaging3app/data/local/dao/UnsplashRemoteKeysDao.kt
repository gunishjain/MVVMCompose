package com.gunishjain.mvvmpaging3app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.gunishjain.mvvmpaging3app.data.models.UnsplashRemoteKeys


@Dao
interface UnsplashRemoteKeysDao {

    @Query("SELECT * FROM remote_keys_table WHERE id=:id")
    suspend fun getRemoteKeys(id: String): UnsplashRemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

    @Query("DELETE FROM remote_keys_table")
    suspend fun deleteAllRemoteKeys()

}