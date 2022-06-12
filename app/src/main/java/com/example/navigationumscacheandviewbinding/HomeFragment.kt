package com.example.navigationumscacheandviewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {



    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root =  inflater.inflate(R.layout.fragment_home, container, false)

        return root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        root.findViewById<LinearLayout>(R.id.tariflar_id).setOnClickListener {

            findNavController().navigate(R.id.firstFragment)

        }


    }

}