package com.gunishjain.mvvmpaging3app.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.gunishjain.mvvmpaging3app.data.local.UnsplashDatabase
import com.gunishjain.mvvmpaging3app.data.models.UnsplashImage
import com.gunishjain.mvvmpaging3app.data.paging.UnsplashRemoteMediator
import com.gunishjain.mvvmpaging3app.data.remote.UnsplashApi
import com.gunishjain.mvvmpaging3app.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ExperimentalPagingApi
class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {


    fun getAllImages() : Flow<PagingData<UnsplashImage>> {
        val pagingSourceFactory = { unsplashDatabase.unsplashImageDao().getAllImages()}
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = UnsplashRemoteMediator(
                unsplashApi=unsplashApi,
                unsplashDatabase=unsplashDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }


}