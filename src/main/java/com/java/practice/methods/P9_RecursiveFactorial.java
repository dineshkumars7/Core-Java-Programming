package com.java.practice.methods;

public class P9_RecursiveFactorial {
	 static long factorial(int n) {
	        if (n <= 1) {
	            return 1; // Base case
	        }
	        return n * factorial(n - 1); // Recursive call
	    }

	    public static void main(String[] args) {
	        int num = 5;
	        System.out.println("Factorial of " + num + " is: " + factorial(num));
	    }
}
