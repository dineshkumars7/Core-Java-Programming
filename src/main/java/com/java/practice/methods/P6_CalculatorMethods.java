package com.java.practice.methods;

public class P6_CalculatorMethods {
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        double x = 20, y = 4;
        System.out.println("Addition       : " + add(x, y));
        System.out.println("Subtraction    : " + subtract(x, y));
        System.out.println("Multiplication : " + multiply(x, y));
        System.out.println("Division       : " + divide(x, y));
    }

}
