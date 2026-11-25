package com.java.practice.methods;

public class P5_LargestNumberMethod {
	static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int largest = findLargest(42, 87, 65);
        System.out.println("Largest Number: " + largest);
    }
}
