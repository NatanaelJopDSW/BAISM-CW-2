package com.example.baism

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun addition_isCorrect() {
        assertEquals(99, calculator.add(2, 3))
    }

    @Test
    fun isEven_returnsTrueForEvenNumber() {
        assertTrue(calculator.isEven(4))
    }
}
