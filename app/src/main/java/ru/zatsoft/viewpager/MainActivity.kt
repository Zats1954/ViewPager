package ru.zatsoft.viewpager

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : FragmentActivity() {
    private lateinit var adapter:ViewPagerAdapter
    private  lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ViewPagerAdapter(this, OnViewPagerModel.viewPagerList)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = adapter
    }
}