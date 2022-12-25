package com.example.cleanarchitecture.domain.usecases

import com.example.cleanarchitecture.domain.repositories.UserInfoRepository
import javax.inject.Inject

class SaveUserInfoUseCases @Inject constructor(
    private val repository: UserInfoRepository
) {
    operator fun invoke(username: String, userage: String, useremail: String, password: String){
        repository.saveUserInfo(username, userage, useremail, password)
    }
}