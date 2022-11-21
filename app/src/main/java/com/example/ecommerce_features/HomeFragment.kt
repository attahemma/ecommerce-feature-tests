package com.example.ecommerce_features

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommerce_features.adapters.ProductAdapter
import com.example.ecommerce_features.databinding.FragmentHomeBinding
import com.example.ecommerce_features.models.ProductItem
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class HomeFragment : Fragment() {

    private val binding get() = _binding
    private lateinit var _binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentHomeBinding.inflate(inflater, container, false)

        val carousel = binding.bannerSlider
        carousel.registerLifecycle(viewLifecycleOwner)
        val list = mutableListOf<CarouselItem>()
        // Image URL with caption
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.banner_image
            )
        )

        // Just image URL
        list.add(
            CarouselItem(
                imageDrawable = R.drawable.banner_image
            )
        )
        val indicator = binding.customIndicator
        binding.bannerSlider.setIndicator(indicator)

        carousel.setData(list)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var rvTopSelling = binding.rvTopSelling

        val rvLayoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        rvTopSelling.layoutManager = rvLayoutManager

        var productList = listOf(
            ProductItem("samsung galaxy","4.2","24","N235,000",""),
            ProductItem("water bottles","2.2","10","N5,000",""),
            ProductItem("ankle chain","4.0","90","N1,900",""),
            ProductItem("galaxy buds 2","3.7","7","N127,000",""),
            ProductItem("nike airforce 1","5","124","N45,000",""),
            ProductItem("gucci T-shirt","0","0","N8,915",""),
            ProductItem("men's ankle socks","1.9","12","N2000",""),
        )
        var rvAdapter = ProductAdapter(requireContext(),productList)

        rvTopSelling.adapter = rvAdapter

        setupRecentlyViewed()
    }
    private fun setupRecentlyViewed(){
        var rvRecentlyViewed = binding.rvTopViewed

        val rvLayoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        rvRecentlyViewed.layoutManager = rvLayoutManager

        var productList = listOf(
            ProductItem("samsung galaxy","4.2","24","N235,000",""),
            ProductItem("water bottles","2.2","10","N5,000",""),
            ProductItem("ankle chain","4.0","90","N1,900",""),
            ProductItem("galaxy buds 2","3.7","7","N127,000",""),
            ProductItem("nike airforce 1","5","124","N45,000",""),
            ProductItem("gucci T-shirt","0","0","N8,915",""),
            ProductItem("men's ankle socks","1.9","12","N2000",""),
        )
        var rvAdapter = ProductAdapter(requireContext(),productList)

        rvRecentlyViewed.adapter = rvAdapter
    }
}