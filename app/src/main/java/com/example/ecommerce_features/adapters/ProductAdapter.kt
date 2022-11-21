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
import com.example.ecommerce_features.models.ProductItem
import me.zhanghai.android.materialratingbar.MaterialRatingBar

class ProductAdapter(var context:Context, var products:List<ProductItem>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    class ProductViewHolder(@NonNull itemView:View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(product: ProductItem){
            itemView.findViewById<TextView>(R.id.product_title).text = product.name
            itemView.findViewById<TextView>(R.id.product_price).text = product.price
            itemView.findViewById<MaterialRatingBar>(R.id.user_rating).rating = product.rating.toFloat()
            itemView.findViewById<TextView>(R.id.product_rating_count).text = product.ratingCount
            itemView.findViewById<ImageView>(R.id.product_thumb).setImageDrawable(itemView.resources.getDrawable(R.drawable.water_bottles))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_product,parent,false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        var product = products[position]
        holder.bindItem(product)
    }

    override fun getItemCount(): Int = products.size

}