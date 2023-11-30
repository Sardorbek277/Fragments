package com.example.fragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragments.databinding.OlimovviewBinding

class olimovFragment : Fragment(){

    private lateinit var binding: OlimovviewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= OlimovviewBinding.inflate(layoutInflater)

        binding.root.setOnClickListener{
            Toast.makeText(context, "Xojiakbar", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

}