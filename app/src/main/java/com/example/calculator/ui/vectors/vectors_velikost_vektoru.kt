package com.example.calculator.ui.vectors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.calculator.databinding.FragmentVectorMagnitudeBinding
import com.example.calculator.math.functions.VectorMagnitude


class vectors_velikost_vektoru : Fragment() {

    private var _binding: FragmentVectorMagnitudeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentVectorMagnitudeBinding.inflate(inflater, container, false)

        binding.calculateButton.setOnClickListener { computeScalarProduct() }

        return binding.root
    }

    private fun computeScalarProduct() {
        val x1 = binding.vectorX.text.toString().toDoubleOrNull()
        val y1 = binding.vectorY.text.toString().toDoubleOrNull()
        val z1 = binding.vectorZ.text.toString().toDoubleOrNull()

        var result = VectorMagnitude().GetVectorMagnitude(x1, y1, z1).toString()

        if(result == "null"){
            result = ""
        }
        binding.result.text = result
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}