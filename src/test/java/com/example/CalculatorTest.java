package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void addsTwoNumbers() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void factorialOfZeroIsOne() {
        assertEquals(1, Calculator.factorial(0));
    }

    @Test
    void factorialOfOneIsOne() {
        assertEquals(1, Calculator.factorial(1));
    }

    @Test
    void factorialOfFiveIs120() {
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    void factorialOfNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.factorial(-1));
    }
}
