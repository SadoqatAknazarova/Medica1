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

class Splash1Fragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding =FragmentSplash1Binding.inflate(inflater,container,false)

       val handler=Handler(Looper.getMainLooper())
        handler.postDelayed({
            findNavController().navigate(R.id.action_splash1Fragment_to_splash2Fragment)
        },2000)
       return binding.root
    }


}