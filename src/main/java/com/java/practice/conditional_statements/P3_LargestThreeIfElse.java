package com.java.practice.conditional_statements;

public class P3_LargestThreeIfElse {
	public static void main(String[] args) {
        int a = 35, b = 78, c = 52;

        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
    }
}
