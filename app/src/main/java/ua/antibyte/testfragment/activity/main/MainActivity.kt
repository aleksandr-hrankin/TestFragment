package ua.antibyte.testfragment.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ua.antibyte.testfragment.R
import ua.antibyte.testfragment.fragment.bottom1.Bottom1Fragment
import ua.antibyte.testfragment.fragment.bottom2.Bottom2Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager()
    }

    private fun initViewPager() {
        val adapter = ViewPagerAdapter(this, getFragmentList())
        view_pager.adapter = adapter
    }

    private fun getFragmentList() = listOf(
        Bottom1Fragment(),
        Bottom2Fragment()
    )
}