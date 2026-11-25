package com.java.practice.methods;

public class P2_MethodWtihParameters {
	static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    public static void main(String[] args) {
        printSum(15, 25);
    }
}
