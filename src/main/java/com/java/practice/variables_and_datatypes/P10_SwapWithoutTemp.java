package com.java.practice.variables_and_datatypes;

public class P10_SwapWithoutTemp {
	public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a + b; // a becomes 30
        b = a - b; // b becomes 10
        a = a - b; // a becomes 20

        System.out.println("After Swap : a = " + a + ", b = " + b);
    }
}
