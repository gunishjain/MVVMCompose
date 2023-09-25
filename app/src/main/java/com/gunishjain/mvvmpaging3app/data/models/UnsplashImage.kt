package com.gunishjain.mvvmpaging3app.data.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gunishjain.mvvmpaging3app.util.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.Serializable

@Entity(tableName = UNSPLASH_IMAGE_TABLE)
@Serializable
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val likes: Int,
    @Embedded
    val user: User,
    @Embedded
    val urls: Urls
)
