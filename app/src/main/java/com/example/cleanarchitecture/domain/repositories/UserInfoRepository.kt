package com.example.cleanarchitecture.domain.repositories

interface UserInfoRepository {

    fun saveUserInfo(username: String, userage: String, useremail: String, password: String)

    fun getUserInfo(): String

}