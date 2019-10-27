package com.aptkode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathHelperTest {

    @Test
    void factorialTest() {
        assertEquals(1, MathHelper.factorial(0));
        assertEquals(1, MathHelper.factorial(1));
        assertEquals(120, MathHelper.factorial(5));
        assertEquals(720, MathHelper.factorial(6));
    }

    @Test
    void factorialIllegalArgumentTest()
    {
        assertThrows(IllegalArgumentException.class, () -> MathHelper.factorial(-1));
    }

}
