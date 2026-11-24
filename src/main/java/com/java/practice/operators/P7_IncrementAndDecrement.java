package com.java.practice.operators;

public class P7_IncrementAndDecrement {
	 public static void main(String[] args) {
	        int count = 10;

	        System.out.println("Initial value  : " + count);
	        System.out.println("Pre-increment  : " + (++count)); // Increments to 11, then prints 11
	        System.out.println("Post-increment : " + (count++)); // Prints 11, then increments to 12
	        System.out.println("After post-inc : " + count);
	        System.out.println("Pre-decrement  : " + (--count)); // Decrements to 11, then prints 11
	        System.out.println("Post-decrement : " + (count--)); // Prints 11, then decrements to 10
	        System.out.println("Final value    : " + count);
	    }
}
