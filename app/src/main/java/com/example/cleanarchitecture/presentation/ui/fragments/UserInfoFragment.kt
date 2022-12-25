package com.example.cleanarchitecture.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.cleanarchitecture.databinding.FragmentUserInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserInfoFragment : Fragment() {
    private var _binding: FragmentUserInfoBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<UserViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserInfoBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        binding.let {
            it.btnUserInfo.setOnClickListener { _ ->
                it.tvUsername.text = viewModel.getName()
                it.tvUserage.text = viewModel.getAge()
                it.tvUseremail.text = viewModel.getEmail()
                it.tvPassword.text = viewModel.getPassword()
            }
        }
    }
}