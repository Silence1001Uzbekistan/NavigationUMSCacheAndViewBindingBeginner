package com.example.navigationumscacheandviewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationumscacheandviewbinding.CLASS.UMS
import com.example.navigationumscacheandviewbinding.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ums = arguments?.getSerializable("a") as UMS

        binding.titleS.text = ums.titleData
        binding.dataS.text = ums.longData

    }

}