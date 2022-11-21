package com.example.ecommerce_features.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce_features.R
import com.example.ecommerce_features.models.ReviewModel
import de.hdodenhof.circleimageview.CircleImageView
import me.zhanghai.android.materialratingbar.MaterialRatingBar

class ReviewAdapter(var context:Context, var reviewItems:List<ReviewModel>) :
    RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder>(){
    class ReviewViewHolder(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(reviewItem: ReviewModel){
            itemView.findViewById<TextView>(R.id.user_review).text = reviewItem.review
            itemView.findViewById<TextView>(R.id.review_date).text = reviewItem.date
            itemView.findViewById<MaterialRatingBar>(R.id.user_rating).rating = reviewItem.rating
            itemView.findViewById<TextView>(R.id.user_name).text = reviewItem.name
            itemView.findViewById<CircleImageView>(R.id.user_thumb).setImageDrawable(itemView.resources.getDrawable(
                R.drawable.product_preview_icon_1))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_user_review,parent,false)
        return ReviewViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        var review = reviewItems[position]
        holder.bindItem(review)
    }

    override fun getItemCount(): Int = reviewItems.size
}