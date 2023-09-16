package com.example.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.navigationodev.databinding.FragmentXBinding
import com.example.navigationodev.databinding.FragmentYBinding
import com.google.android.material.snackbar.Snackbar

class YFragment : Fragment() {
    private lateinit var binding: FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentYBinding.inflate(inflater, container, false)
        val geriTusu = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                val anaSayfaGit = YFragmentDirections.anaSayfaGecis()
                Navigation.findNavController(requireView()).navigate(anaSayfaGit)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)
        return binding.root
    }
}