package com.java.practice.looping_statements;

public class P9_BreakAndContinue {
	 public static void main(String[] args) {
	        for (int i = 1; i <= 20; i++) {
	            if (i == 15) {
	                break; // Stop the loop completely at 15
	            }
	            if (i % 3 == 0) {
	                continue; // Skip multiples of 3
	            }
	            System.out.print(i + " ");
	        }
	    }
}
