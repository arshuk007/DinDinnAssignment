package com.example.dindinn.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.dindinn.fragments.IncredientFragment
import com.example.dindinn.model.IncredientCategory
import java.util.*

class CategoryViewPagerAdapter(fm: FragmentManager, private val categories: ArrayList<IncredientCategory>) :
        FragmentStatePagerAdapter(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return IncredientFragment.newInstance(categories.get(position).items)
    }

    override fun getCount(): Int {
        return categories.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return categories[position].category
    }

}