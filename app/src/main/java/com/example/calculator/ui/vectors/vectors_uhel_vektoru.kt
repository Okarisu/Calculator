package com.example.calculator.ui.vectors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.calculator.databinding.FragmentVectorsAngleBinding
import com.example.calculator.math.functions.ScalarProduct
import com.example.calculator.math.functions.VectorMagnitude
import kotlin.math.cos
import kotlin.math.pow


class vectors_uhel_vektoru : Fragment() {

    private var _binding: FragmentVectorsAngleBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentVectorsAngleBinding.inflate(inflater, container, false)

        binding.calculateButton.setOnClickListener { binding.result.text = computeVectorAngle() }

        return binding.root
    }

    private fun computeVectorAngle(): String {
        val x1 = binding.vector1X.text.toString().toDoubleOrNull()
        val y1 = binding.vector1Y.text.toString().toDoubleOrNull()
        val z1 = binding.vector1Z.text.toString().toDoubleOrNull()

        val x2 = binding.vector2X.text.toString().toDoubleOrNull()
        val y2 = binding.vector2Y.text.toString().toDoubleOrNull()
        val z2 = binding.vector2Z.text.toString().toDoubleOrNull()

        var numerator = ScalarProduct().GetScalarProduct(x1, y1, z1, x2, y2, z2)
        val nomenator1 = VectorMagnitude().GetVectorMagnitude(x1, y1, z1)
        val nomenator2 = VectorMagnitude().GetVectorMagnitude(x2, y2, z2)

        var result: String

        if(numerator == null || nomenator1 == null || nomenator2 == null){
            return ""
        } else {
            val fraction: Double = numerator.div((nomenator1 * nomenator2))
            val angle = cos(fraction).pow(-1)
            return angle.toString()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}