package com.java.practice.operators;

public class P10_LargestOfThree {
	 public static void main(String[] args) {
	        int a = 45;
	        int b = 89;
	        int c = 62;

	        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
	        System.out.println("Largest number is: " + largest);
	    }
}
