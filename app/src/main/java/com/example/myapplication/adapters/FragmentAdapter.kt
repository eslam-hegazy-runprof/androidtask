package com.example.myapplication.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.ui.Fragment1
import com.example.myapplication.ui.Fragment2
import com.example.myapplication.ui.MainActivity

class FragmentAdapter(mainActivity: MainActivity) : FragmentStateAdapter(mainActivity) {
    private val fragmentSize = 2
    override fun getItemCount(): Int {
        return fragmentSize
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
        }
        return Fragment2()
    }
}