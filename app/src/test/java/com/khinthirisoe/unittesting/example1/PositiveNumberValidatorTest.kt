package com.khinthirisoe.unittesting.example1

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class PositiveNumberValidatorTest {

    lateinit var positiveNumberValidator: PositiveNumberValidator

    @Before
    fun setup(){
        positiveNumberValidator = PositiveNumberValidator()
    }

    @Test
    fun shouldNotBePositive() {
        assertFalse(positiveNumberValidator.isPositive(-1))
        assertFalse(positiveNumberValidator.isPositive(0))
        assertFalse(positiveNumberValidator.isPositive(-200))
    }

    @Test
    fun shouldBePositive() {
        assertTrue(positiveNumberValidator.isPositive(1))
        assertTrue(positiveNumberValidator.isPositive(10))
        assertTrue(positiveNumberValidator.isPositive(100))
    }
}