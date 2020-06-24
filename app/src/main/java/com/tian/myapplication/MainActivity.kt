package com.tian.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = this as AppCompatActivity

        val adapter = object : FragmentPagerAdapter(activity.supportFragmentManager) {
            override fun getItem(position: Int): Fragment {
                return FragmentData(position.toString())
            }

            override fun getCount(): Int {
                return 6
            }

        }

        viewPager.adapter = adapter
    }
}