package com.example.cleanarchitecture.data.repositories

import android.content.SharedPreferences
import com.example.cleanarchitecture.data.local.sharedpreferences.UserPreferencesHelper
import com.example.cleanarchitecture.domain.repositories.UserInfoRepository
import javax.inject.Inject

class RepositoriesImpl @Inject constructor(
    private val preferences: UserPreferencesHelper
) : UserInfoRepository {

    override fun saveUserInfo(
        username: String,
        userage: String,
        useremail: String,
        password: String
    ) {
        preferences.username = username
        preferences.userage = userage
        preferences.useremail = useremail
        preferences.password = password
    }

    override fun getUserName() = preferences.username!!

    override fun getUserAge() = preferences.userage!!

    override fun getUserEmail() = preferences.useremail!!

    override fun getUserPassword() = preferences.password!!

}