package com.example.cleanarchitecture.presentation.ui.fragments

import androidx.lifecycle.ViewModel
import com.example.cleanarchitecture.domain.usecases.SaveUserInfoUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val saveUserInfoUseCases: SaveUserInfoUseCases,
) : ViewModel() {
    fun saveUserInfo(username: String, userage: String, useremail: String, password: String) {
        saveUserInfoUseCases(username, userage, useremail, password)
    }
}