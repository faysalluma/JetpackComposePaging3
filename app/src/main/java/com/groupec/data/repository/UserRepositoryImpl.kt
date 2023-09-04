package com.groupec.data.repository

import kotlinx.coroutines.delay
import com.groupec.data.network.UsersApi
import com.groupec.data.network.UsersResponse
import java.io.IOException

class UserRepositoryImpl(
    private val api: UsersApi
) : UserRepository {
    var error = 0
    override suspend fun getUsers(page: Int, limit: Int): UsersResponse {
        delay(3000L)
        error++
        if (error==4)
            throw IOException("Some Error occured")
        return api.getUsers(page, limit)
    }
}