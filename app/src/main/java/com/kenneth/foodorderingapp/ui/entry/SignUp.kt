package com.kenneth.foodorderingapp.ui.entry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kenneth.foodorderingapp.R
import com.kenneth.foodorderingapp.databinding.FragmentLoginBinding
import com.kenneth.foodorderingapp.databinding.FragmentSignUpBinding


class SignUp : Fragment() {

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        val view = binding.root




        // Thou shall not cross. You shall not Pass
        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}