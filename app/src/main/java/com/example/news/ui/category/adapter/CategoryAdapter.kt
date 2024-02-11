package com.example.news.ui.category.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.news.R
import com.example.news.ui.category.CategoryItem

class CategoryAdapter(
    private val listofCategories:List<CategoryItem>
): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){

    class CategoryViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.background_image)
        val deptName = itemView.findViewById<TextView>(R.id.cite_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item,parent,false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listofCategories.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val currCategory = listofCategories[position]
        holder.image.setImageResource(currCategory.image)
        holder.deptName.text = currCategory.departMentName
    }
}
