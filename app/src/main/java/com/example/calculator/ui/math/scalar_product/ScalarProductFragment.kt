package com.example.calculator.ui.math.scalar_product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.calculator.databinding.FragmentScalarProductBinding


class ScalarProductFragment : Fragment() {

    private var _binding: FragmentScalarProductBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentScalarProductBinding.inflate(inflater, container, false)

        binding.calculateButton.setOnClickListener { computeScalarProduct() }

        return binding.root
    }

    private fun computeScalarProduct() {
        val x1 = binding.vector1X.text.toString().toDoubleOrNull();
        val y1 = binding.vector1Y.text.toString().toDoubleOrNull();
        var z1 = binding.vector1Z.text.toString().toDoubleOrNull();

        val x2 = binding.vector2X.text.toString().toDoubleOrNull();
        val y2 = binding.vector2Y.text.toString().toDoubleOrNull();
        var z2 = binding.vector2Z.text.toString().toDoubleOrNull();


        if ((x1 == null) || (x2 == null) || (y1 == null) || (y2 == null)) {
            binding.result.text = ""
            return
        } else {

            if ((z1 == null) || (z2 == null)) {
                z1 = 0.0
                z2 = 0.0
            }

            val result = x1 * x2 + y1 * y2 + z1 * z2

            binding.result.text = result.toString()

        }
    }
        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }

}