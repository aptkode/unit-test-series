package com.aptkode.math;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@Epic("Math Operations")
@Feature("Math Helper methods")
class MathHelperTest {

    @Story("When user enters number to factorial it should returns value's factorial")
    @Description("factorial calculates factorial of a valid number")
    @ParameterizedTest(name = "[{index}] - {0} should return {1}")
    @CsvSource(value = {"0|1", "1|1", "5|120", "6|720"}, delimiter = '|')
    void factorialTest(int number, int expectedValue) {
        assertEquals(expectedValue, MathHelper.factorial(number));
    }

    @Test
    void factorialIllegalArgumentTest() {
        assertThrows(IllegalArgumentException.class, () -> MathHelper.factorial(-1));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 7, 11, 13, 23})
    void isPrimeReturnsTrueForPrimesTest(int number) {
        assertTrue(MathHelper.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 9, 10})
    void isPrimeReturnsFalseForNonPrimesTest(int number) {
        assertFalse(MathHelper.isPrime(number));
    }

}
