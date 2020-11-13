package com.michalkubiak.samplenavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_3.view.*

class Fragment3 : Fragment() {

    private val args: Fragment3Args by navArgs() //TODO <------------------------------ that's it

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_3, container, false)

        val text = args.text //TODO <------------------------------ get arg
        view.textArg.text = text

        /** HOW COOL IS THAT ?! **/

        return view
    }
}