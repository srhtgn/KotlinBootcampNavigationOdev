package com.example.navigationodev

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.databinding.FragmentXBinding

class XFragment : Fragment() {

    private lateinit var binding: FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentXBinding.inflate(inflater, container, false)

        binding.buttonYGit1.setOnClickListener {
            val yGecis = XFragmentDirections.xYGecis()
            Navigation.findNavController(it).navigate(yGecis)
        }
        return binding.root
    }
}