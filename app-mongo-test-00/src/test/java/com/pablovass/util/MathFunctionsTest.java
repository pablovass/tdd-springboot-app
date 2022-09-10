package com.pablovass.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathFunctionsTest {
    @Test
    void Should_return_a_value() {

        assertEquals(12,MathFunctions.square.apply(12));
    }

    @Test
    void Sould_return_false() {
        assertEquals(false,MathFunctions.isOdd.equals(true));
    }
    @Test
    void Sould_return_true() {
        assertEquals(false,MathFunctions.isEven.equals(false));
    }
}