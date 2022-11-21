package com.example.ecommerce_features.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(var fm: FragmentManager) : FragmentPagerAdapter(fm,  BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val mListFragments: MutableList<Fragment> = ArrayList()
    private val mListFragmentTitles: MutableList<String> = ArrayList()

    override fun getCount(): Int = mListFragmentTitles.size

    override fun getItem(position: Int): Fragment = mListFragments[position]

    override fun getPageTitle(position: Int): CharSequence? = mListFragmentTitles[position]

    fun addFragment(fragment: Fragment?, title: String?) {
        mListFragments.add(fragment!!)
        mListFragmentTitles.add(title!!)
    }
}