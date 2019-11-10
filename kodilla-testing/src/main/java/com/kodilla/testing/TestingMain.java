package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.add(5, 9);

        if (result != 0) {
            System.out.println("test 1 OK");
        } else {
            System.out.println("Error");
        }

        int result1 = calculator.subtract(8, 4);

        if (result1 != 0) {
            System.out.println("test 2 OK");
        } else {
            System.out.println("Error");
        }
    }
}