package com.example.cleanarchitecture.domain.usecases

import com.example.cleanarchitecture.domain.repositories.UserInfoRepository
import javax.inject.Inject

class GetUserInfoUseCase @Inject constructor(
    private val repository: UserInfoRepository
) {
    fun invoke() = repository.getUserInfo()
}