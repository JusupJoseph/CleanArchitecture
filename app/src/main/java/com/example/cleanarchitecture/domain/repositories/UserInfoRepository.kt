package com.example.cleanarchitecture.domain.repositories

interface UserInfoRepository {

    fun saveUserInfo(username: String, userage: String, useremail: String, password: String)

    fun getUserName(): String

    fun getUserAge(): String

    fun getUserEmail(): String

    fun getUserPassword(): String

}