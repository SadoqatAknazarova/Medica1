package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.myapplication.databinding.FragmentSplash5Binding



class Splash5Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentSplash5Binding.inflate(inflater,container,false)
       binding.start.setOnClickListener {
            findNavController().navigate(R.id.action_splash5Fragment_to_signFragment)
        }
        return binding.root
    }


}