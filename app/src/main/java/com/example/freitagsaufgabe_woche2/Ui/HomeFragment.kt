package com.example.freitagsaufgabe_woche2.Ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.freitagsaufgabe_woche2.Adapter.ItemAdapter
import com.example.freitagsaufgabe_woche2.MainActivity
import com.example.freitagsaufgabe_woche2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.IBplus.setOnClickListener {

            val navController = findNavController()

            navController.navigate(HomeFragmentDirections.actionHomeFragmentToPlusFragment())
        }

        val mainActivity = activity as MainActivity

        val dataset = mainActivity.dataset
        val adapter = ItemAdapter(dataset)
        binding.RVelement.adapter = adapter

    }
}