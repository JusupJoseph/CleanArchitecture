package com.example.cleanarchitecture.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.cleanarchitecture.R
import com.example.cleanarchitecture.databinding.FragmentSignInBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignIn : Fragment() {
    lateinit var binding : FragmentSignInBinding
    private val viewModel by viewModels<SignInViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        binding.let {
            it.signInButton.setOnClickListener { _ ->
                val username = it.etUsername.text.toString().trim()
                val userage = it.etUserage.text.toString().trim()
                val useremail = it.etUseremail.text.toString().trim()
                val password = it.etPassword.text.toString().trim()

                viewModel.saveUserInfo(username, userage, useremail, password)
                findNavController().navigate(R.id.userInfoFragment)

            }
        }
    }
}