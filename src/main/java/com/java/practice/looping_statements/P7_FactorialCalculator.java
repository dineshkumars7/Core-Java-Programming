package com.java.practice.looping_statements;

public class P7_FactorialCalculator {
	 public static void main(String[] args) {
	        int num = 5;
	        long factorial = 1; // Use long to handle larger factorials

	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }

	        System.out.println("Factorial of " + num + " is: " + factorial);
	    }
}
