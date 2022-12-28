package com.example.cleanarchitecture.data.repositories

import com.example.cleanarchitecture.data.local.sharedpreferences.UserPreferencesHelper
import com.example.cleanarchitecture.domain.repositories.UserInfoRepository
import java.util.*
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

    val UserInfo = arrayOf(preferences.userage, preferences.username, preferences.password, preferences.useremail)

    override fun getUserInfo() = Arrays.toString(UserInfo)

}