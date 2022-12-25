package com.example.cleanarchitecture.di

import com.example.cleanarchitecture.data.repositories.RepositoriesImpl
import com.example.cleanarchitecture.domain.repositories.UserInfoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindUserRepository(repositoriesImpl: RepositoriesImpl): UserInfoRepository
}