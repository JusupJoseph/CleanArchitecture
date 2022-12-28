package com.example.cleanarchitecture.presentation.ui.fragments

import androidx.lifecycle.ViewModel
import com.example.cleanarchitecture.domain.usecases.GetUserInfoUseCase
import com.example.cleanarchitecture.domain.usecases.SaveUserInfoUseCases
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val getUserUseCase: GetUserInfoUseCase
) : ViewModel() {
    fun getUserInfo() = getUserUseCase.invoke()
}