package com.kodilla.kodillacourse;

public class CalcApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.addNumbers(5, 9);
        int result1 = calculator.subtractNumbers(8, 4);

        System.out.println(result);
        System.out.println(result1);
    }
}
