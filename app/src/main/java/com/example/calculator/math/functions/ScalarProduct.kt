package com.example.calculator.math.functions

public class ScalarProduct(

) {
    public fun GetScalarProduct(
        x1: Double?,
        y1: Double?,
        z1: Double?,
        x2: Double?,
        y2: Double?,
        z2: Double?
    ): Double? {
        var z1: Double? = z1
        var z2: Double? = z2

        if ((x1 == null) || (x2 == null) || (y1 == null) || (y2 == null)) {
            return null
        } else {

            if ((z1 == null) || (z2 == null)) {
                z1 = 0.0
                z2 = 0.0
            }
            return x1 * x2 + y1 * y2 + z1 * z2
        }
    }
}