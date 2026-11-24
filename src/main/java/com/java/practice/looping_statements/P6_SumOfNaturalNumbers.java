package com.java.practice.looping_statements;

public class P6_SumOfNaturalNumbers {
	 public static void main(String[] args) {
	        int n = 50;
	        int sum = 0;

	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }

	        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
	    }
}
