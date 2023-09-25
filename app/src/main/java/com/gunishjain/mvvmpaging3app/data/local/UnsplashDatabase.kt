package com.gunishjain.mvvmpaging3app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gunishjain.mvvmpaging3app.data.local.dao.UnsplashImageDao
import com.gunishjain.mvvmpaging3app.data.local.dao.UnsplashRemoteKeysDao
import com.gunishjain.mvvmpaging3app.data.models.UnsplashImage
import com.gunishjain.mvvmpaging3app.data.models.UnsplashRemoteKeys


@Database(entities = [UnsplashImage::class,UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao():UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}