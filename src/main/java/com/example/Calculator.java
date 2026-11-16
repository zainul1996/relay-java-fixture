package com.example;

public final class Calculator {
    private Calculator() {}

    public static int add(int left, int right) {
        return left + right;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("factorial is undefined for negative input: " + n);
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
