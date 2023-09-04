package com.groupec.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.groupec.data.network.UsersApi
import com.groupec.data.repository.UserRepository
import com.groupec.data.repository.UserRepositoryImpl

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideUsersApi(): UsersApi = UsersApi()

    @Provides
    fun provideUserRepository(api: UsersApi): UserRepository = UserRepositoryImpl(api)
}