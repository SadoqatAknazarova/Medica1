package com.example.myapplication

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentSplash1Binding
import com.example.myapplication.databinding.FragmentSplash3Binding


class Splash3Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentSplash3Binding.inflate(inflater,container,false)
        binding.next1.setOnClickListener {
            findNavController().navigate(R.id.action_splash3Fragment_to_splash4Fragment)
        }

        return binding.root
    }


}