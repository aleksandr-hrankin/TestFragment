package ua.antibyte.testfragment.fragment.top

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewStub
import androidx.fragment.app.Fragment
import ua.antibyte.testfragment.R

abstract class TopFragment : Fragment(R.layout.fragment_top) {
    fun getViewFromFragment(
        inflater: LayoutInflater,
        container: ViewGroup?,
        layoutResId: Int
    ): View {
        val rootView = inflater.inflate(R.layout.fragment_top, container, false)
        val viewStub = rootView.findViewById<ViewStub>(R.id.bottom_container)
        viewStub.layoutResource = layoutResId
        viewStub.inflate()
        return rootView
    }
}