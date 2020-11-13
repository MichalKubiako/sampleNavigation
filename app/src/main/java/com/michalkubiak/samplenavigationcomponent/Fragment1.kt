package com.michalkubiak.samplenavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_1.view.*

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        view.button_f1_to_f2.setOnClickListener { v ->
            v.findNavController().navigate(R.id.action_fragment1_to_fragment2) //TODO simple as that
        }

        view.button_f1_to_f3.setOnClickListener { v ->
            v.findNavController().navigate(R.id.action_fragment1_to_fragment3)
        }

        view.button_f1_to_f3_pass_text.setOnClickListener { v ->
            val getText = view.text_from_f1.text.toString()
            val action = Fragment1Directions.actionFragment1ToFragment3(getText) // TODO passing string
            Navigation.findNavController(v).navigate(action)
        }

        /** super easy passing arguments **/

        return view
    }

}