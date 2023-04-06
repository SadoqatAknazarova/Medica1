package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentSplash4Binding


class Splash4Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentSplash4Binding.inflate(inflater,container,false)
        binding.next2.setOnClickListener {
            findNavController().navigate(R.id.action_splash4Fragment_to_splash5Fragment)
        }
        return binding.root
    }


    }
