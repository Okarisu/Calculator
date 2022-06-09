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

        binding.calculateButton.setOnClickListener { binding.result.text = Pytha() }

        return binding.root
    }

    private fun Pytha(): String {
        var a = binding.valA.text.toString().toDoubleOrNull()
        var b = binding.valB.text.toString().toDoubleOrNull()
        var c = binding.valC.text.toString().toDoubleOrNull()

        return if (((a == null && b == null) || (a == null && c == null) || (b == null && c == null)) || ((a != null) && (b != null) && (c != null))) {
            //Ošetření stavu 'všechny hodnoty zadané' a 'zadáno málo hodnot'
            ""
        } else {
            if (a == null) {
                a = ComputePytha(c!!, b!!, true)
            } else if (b == null) {
                b = ComputePytha(c!!, b!!, true)
            } else {
                c = ComputePytha(a, b, false)
            }
            a.toString() + "² + " + b.toString() + "² = " + c.toString() + "²"
        }
    }

    private fun ComputePytha(valA: Double, valB: Double, ordinate: Boolean): Double? {

        return if (ordinate) {
            val bPow = valA.pow(2) - valB.pow(2)
            if (bPow < 0)
                null
            else
                sqrt(bPow)
        } else {
            sqrt(valA.pow(2) + valB.pow(2))

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}