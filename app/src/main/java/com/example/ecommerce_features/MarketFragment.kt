package com.example.ecommerce_features

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ecommerce_features.adapters.PagerAdapter
import com.example.ecommerce_features.databinding.FragmentMarketBinding


class MarketFragment : Fragment() {

    private lateinit var _binding:FragmentMarketBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMarketBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pagerAdapter = PagerAdapter(activity?.supportFragmentManager!!)
        pagerAdapter.addFragment(DescriptionFragment(),"Description")
        pagerAdapter.addFragment(ReviewFragment(),"Reviews")
        pagerAdapter.addFragment(SpecificationFragment(),"Specification")
        binding.tabLayout.setupWithViewPager(binding.pager)
        binding.pager.adapter = pagerAdapter

    }

}