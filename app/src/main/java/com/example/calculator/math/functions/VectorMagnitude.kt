package com.example.calculator.math.functions

import kotlin.math.pow
import kotlin.math.sqrt

public class VectorMagnitude {
    public fun GetVectorMagnitude(x: Double?, y: Double?, z: Double?): Double? {
        var z: Double? = z
        if (x == null || y == null) {
            return null
        } else {
            if (z == null)
                z = 0.0
            return sqrt(x.pow(2) + y.pow(2) + z.pow(2))
        }
    }
}