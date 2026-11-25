package com.java.practice.number_programs;

public class P10_GcdAndLcm {
	 public static void main(String[] args) {
	        int a = 36;
	        int b = 60;

	        int x = a, y = b;

	        // Euclidean algorithm for GCD
	        while (y != 0) {
	            int temp = y;
	            y = x % y;
	            x = temp;
	        }

	        int gcd = x;
	        int lcm = (a * b) / gcd;

	        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
	        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
	    }
}
