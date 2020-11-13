package com.michalkubiak.samplenavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_2.view.*

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)

        view.button_f2_to_bm.setOnClickListener {
            view.findNavController().navigate(R.id.action_fragment2_to_activityMenu2)
        }

        view.button_f2_to_bm_nav.setOnClickListener {
            view.findNavController().navigate(R.id.action_fragment2_to_nav_graph_menu)
        }

        return view
    }
}