package com.aptkode.math;

class MathHelper {

    static int factorial(int i) {
        if( i < 0)
        {
            throw new IllegalArgumentException("input should be greater than 0!");
        }
        if( i == 0 || i == 1)
        {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
