package com.example.freitagsaufgabe_woche2.Ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.freitagsaufgabe_woche2.R
import com.example.freitagsaufgabe_woche2.databinding.FragmentPlusBinding
import com.example.freitagsaufgabe_woche2.databinding.ListItemBinding

class PlusFragment : Fragment() {

    private lateinit var binding: FragmentPlusBinding
    private lateinit var itemBinding: ListItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlusBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.BTNabbrechen.setOnClickListener {

            val navController = findNavController()

            navController.navigate(PlusFragmentDirections.actionPlusFragmentToHomeFragment())
        }

        binding.BTNhinzufGen.setOnClickListener {

            val navController = findNavController()
            val inputText = binding.ETThinzufGen.text.toString()

            if (inputText.isNotEmpty()) {
                itemBinding.TVelement.setText(inputText)
                navController.navigate(PlusFragmentDirections.actionPlusFragmentToHomeFragment())
            } else {
                Toast.makeText(requireContext(), "Du musst das Textfeld noch ausfüllen!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}