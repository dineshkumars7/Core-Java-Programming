package com.java.practice.exception_handling;

public class P1_AithmeticException {
	public static void main(String[] args) {
        int a = 50;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Cannot divide by zero.");
            System.out.println("Error Details: " + e.getMessage());
        }

        System.out.println("Program continues normally...");
    }
}
