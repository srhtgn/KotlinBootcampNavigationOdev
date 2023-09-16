package com.example.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.BFragmentDirections.Companion.bYGecis
import com.example.navigationodev.databinding.FragmentABinding
import com.example.navigationodev.databinding.FragmentBBinding


class BFragment : Fragment() {
    private lateinit var binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)

        binding.buttonYGit.setOnClickListener {
            val yGecis = BFragmentDirections.bYGecis()
            Navigation.findNavController(it).navigate(yGecis)
        }
        return binding.root
    }
}