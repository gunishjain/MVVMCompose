package com.gunishjain.mvvmpaging3app.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gunishjain.mvvmpaging3app.util.Constants.REMOTE_KEYS_TABLE


@Entity(tableName = REMOTE_KEYS_TABLE)
data class UnsplashRemoteKeys(

    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)
