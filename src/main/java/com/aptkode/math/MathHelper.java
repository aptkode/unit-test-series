package com.aptkode.math;

class MathHelper {

    static int factorial(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("input should be greater than 0!");
        }
        if (i == 0 || i == 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }

    static boolean isPrime(int i) {
        if (i == 0 || i == 1) {
            return false;
        }
        for (int n = 2; n <= i / 2; n++) {
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }
}
