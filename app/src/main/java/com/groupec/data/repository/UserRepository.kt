package com.groupec.data.repository

import com.groupec.data.network.UsersResponse

interface UserRepository {

    suspend fun getUsers(page: Int, limit: Int): UsersResponse

}