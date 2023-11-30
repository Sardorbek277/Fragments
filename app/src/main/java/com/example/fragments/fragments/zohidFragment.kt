package com.example.fragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragments.databinding.ZohidViewBinding

class zohidFragment:Fragment() {
    private val binding by lazy { ZohidViewBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.root.setOnClickListener{
            Toast.makeText(context, "Zohidjon", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }
}