package com.example.news.ui.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.news.R
import com.example.news.ui.category.adapter.CategoryAdapter

class CategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category, container, false)
        val categoryRv = view.findViewById<RecyclerView>(R.id.category_recyclerView)
        val itemList = listOf(
            CategoryItem(R.mipmap.ic_launcher, "1ST"),
//            CategoryItem(R.drawable.cea, "2ND"),
//            CategoryItem(R.drawable.cea, "3RD"),
//            CategoryItem(R.drawable.cea, "4TH")
        )
        val adapter = CategoryAdapter(itemList)
        categoryRv.adapter = adapter
        categoryRv.layoutManager = LinearLayoutManager(requireContext())
        return view
    }
}