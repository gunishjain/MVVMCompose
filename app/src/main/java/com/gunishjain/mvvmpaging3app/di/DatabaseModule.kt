package com.gunishjain.mvvmpaging3app.di

import android.content.Context
import androidx.room.Room
import com.gunishjain.mvvmpaging3app.data.local.UnsplashDatabase
import com.gunishjain.mvvmpaging3app.util.Constants.UNSPLASH_DB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesDatabase(
        @ApplicationContext context: Context
    ): UnsplashDatabase {
        return Room.databaseBuilder(
            context,
            UnsplashDatabase::class.java,
            UNSPLASH_DB
        ).build()
    }


}