package com.example.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigationodev.AnaSayfaFragmentDirections
import com.example.navigationodev.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.buttonAGit.setOnClickListener {
            val aGecis = AnaSayfaFragmentDirections.aGecis()
            Navigation.findNavController(it).navigate(aGecis)
        }

        binding.buttonXGit.setOnClickListener {
            val xGecis = AnaSayfaFragmentDirections.xGecis()
            Navigation.findNavController(it).navigate(xGecis)
        }
        return binding.root
    }

}