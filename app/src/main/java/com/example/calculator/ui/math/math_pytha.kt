package com.example.calculator.ui.math

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.calculator.databinding.FragmentPythaBinding
import kotlin.math.pow
import kotlin.math.sqrt


class math_pytha : Fragment() {

    private var _binding: FragmentPythaBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPythaBinding.inflate(inflater, container, false)

        binding.calculateButton.setOnClickListener { Pytha() }

        return binding.root
    }

    private fun Pytha() {
        val a = binding.valA.text.toString().toDoubleOrNull()
        val b = binding.valB.text.toString().toDoubleOrNull()
        val c = binding.valC.text.toString().toDoubleOrNull()

        if ((a == null && b == null) || (a == null && c == null) || (b == null && c == null)) {
            null
        } else {

            binding.result.text = "42"
        }
    }

    private fun ComputePytha(a: Double, b: Double, c: Double): Double? {


           return if (a == null) {
                val aPow = c.pow(2) - b.pow(2)
                if (aPow < 0)
                    null
                else
                    sqrt(aPow)
            } else if (b == null) {
                val bPow = c.pow(2) - a.pow(2)
                if (bPow < 0)
                    null
                else
                    sqrt(bPow)
            } else {
                sqrt(a.pow(2) + b.pow(2))
            }

    }


        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }

    }