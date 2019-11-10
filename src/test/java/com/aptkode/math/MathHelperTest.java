package com.aptkode.math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathHelperTest {

    @ParameterizedTest(name = "[{index}] - {0} should return {1}")
    @CsvSource(value = {"0|1","1|1", "5|120", "6|720"}, delimiter = '|')
    void factorialTest( int number, int expectedValue ) {
        assertEquals(expectedValue, MathHelper.factorial(number));
    }

    @Test
    void factorialIllegalArgumentTest()
    {
        assertThrows(IllegalArgumentException.class, () -> MathHelper.factorial(-1));
    }

}
