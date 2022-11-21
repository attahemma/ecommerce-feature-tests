package com.example.ecommerce_features

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ecommerce_features.databinding.FragmentSpecificationBinding


class SpecificationFragment : Fragment() {

    private lateinit var _binding:FragmentSpecificationBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSpecificationBinding.inflate(inflater, container, false)
        return binding.root
    }

}