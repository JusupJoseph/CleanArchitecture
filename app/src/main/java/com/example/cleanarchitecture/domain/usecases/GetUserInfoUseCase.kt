package com.example.cleanarchitecture.domain.usecases

import com.example.cleanarchitecture.domain.repositories.UserInfoRepository
import javax.inject.Inject

class GetUserInfoUseCase @Inject constructor(
    private val repository: UserInfoRepository
) {
    fun getName() = repository.getUserName()
    fun getAge() = repository.getUserAge()
    fun getEmail() = repository.getUserEmail()
    fun getPassword() = repository.getUserPassword()
}