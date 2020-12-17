package com.ericampire.android.ktordemo.ui.repository

import android.util.Log
import com.ericampire.android.ktordemo.entity.Repository
import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ListRepoRepository @Inject constructor(private val httpClient: HttpClient) {

    suspend fun getRepository() = withContext(Dispatchers.IO) {
        val repositories = httpClient.get<List<Repository>>("https://api.github.com/repositories")
        Log.e("ListRepoRepository", repositories.toString())
        return@withContext repositories
    }
}