package com.example.cleanarchitecture.di

import android.content.Context
import com.example.cleanarchitecture.data.local.sharedpreferences.UserPreferencesHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SharedPreferencesModule {

    @Provides
    @Singleton
    fun provideUserPreferencesHelper(@ApplicationContext context: Context): UserPreferencesHelper {
        return UserPreferencesHelper(context)
    }
}