package ua.antibyte.testfragment.fragment.bottom1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ua.antibyte.testfragment.R
import ua.antibyte.testfragment.fragment.top.TopFragment

class Bottom1Fragment : TopFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return getViewFromFragment(inflater, container, R.layout.fragment_bottom1)
    }
}