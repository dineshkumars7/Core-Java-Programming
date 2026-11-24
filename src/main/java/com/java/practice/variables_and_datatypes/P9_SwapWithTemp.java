package com.java.practice.variables_and_datatypes;

public class P9_SwapWithTemp {
	 public static void main(String[] args) {
	        int a = 10;
	        int b = 20;

	        System.out.println("Before Swap: a = " + a + ", b = " + b);

	        int temp = a;
	        a = b;
	        b = temp;

	        System.out.println("After Swap : a = " + a + ", b = " + b);
	    }

}
