package com.java.practice.conditional_statements;

public class P1_PositiveNegativeZero {
	public static void main(String[] args) {
        int num = -12;

        if (num > 0) {
            System.out.println(num + " is Positive.");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
