package com.example.calculator.ui.math

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.calculator.databinding.FragmentPythaBinding
import com.example.calculator.math.functions.ScalarProduct


class math_pytha : Fragment() {

    private var _binding: FragmentPythaBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPythaBinding.inflate(inflater, container, false)

        binding.calculateButton.setOnClickListener { computeScalarProduct() }

        return binding.root
    }

    private fun computeScalarProduct() {
        val x1 = binding.vector1X.text.toString().toDoubleOrNull()

        binding.result.text = result
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}