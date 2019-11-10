package com.aptkode.math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathHelperTest {

    @ParameterizedTest(name = "[{index}] - {0} should return {1}")
    @MethodSource("factorialTestSource")
    void factorialTest( int number, int expectedValue ) {
        assertEquals(expectedValue, MathHelper.factorial(number));
    }

    private static Stream<Arguments> factorialTestSource()
    {
        return Stream.of(
                Arguments.of( 0, 1 ),
                Arguments.of( 1, 1 ),
                Arguments.of( 5, 120 ),
                Arguments.of( 6, 720 )
        );
    }

    @Test
    void factorialIllegalArgumentTest()
    {
        assertThrows(IllegalArgumentException.class, () -> MathHelper.factorial(-1));
    }

}
