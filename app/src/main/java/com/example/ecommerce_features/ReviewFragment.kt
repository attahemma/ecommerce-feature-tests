package com.example.ecommerce_features

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommerce_features.adapters.ReviewAdapter
import com.example.ecommerce_features.databinding.FragmentReviewBinding
import com.example.ecommerce_features.models.ReviewModel


class ReviewFragment : Fragment() {

    private lateinit var _binding:FragmentReviewBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentReviewBinding.inflate(inflater, container, false)

        //setupReviewRv()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onResume() {
        super.onResume()
        setupReviewRv()
    }

    private fun setupReviewRv(){
        var rvReviews = binding.rvReviews
        rvReviews.hasFixedSize()
        val rvLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)

        rvReviews.layoutManager = rvLayoutManager

        var reviewList = listOf(
            ReviewModel(R.drawable.product_preview_icon_1,4.2f,"This is the sweetest Product I have ever purchased from SmartAfri... Africa to the world...",
                "Attah Emmanuel","Nov. 22, 2022"),
            ReviewModel(R.drawable.product_preview,5f,"Superb seller\n\nFast delivery\n\nWill definitely use again.",
                "Wa Zo Bia","Nov. 22, 2022"),
            ReviewModel(R.drawable.product_preview_icon_1,1.5f,"Very bad seller. Product is fake...\n\nSmartAfri Admins should take note of fake sellers",
                "Okechi Nwafor","Nov. 22, 2022"),
        )
        var rvAdapter = ReviewAdapter(requireContext(),reviewList)

        rvReviews.adapter = rvAdapter
    }

}