package com.java.practice.methods;

public class P7_MethodOverloeadingDemo {
	static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 integers: " + sum(10, 20));
        System.out.println("Sum of 3 integers: " + sum(10, 20, 30));
        System.out.println("Sum of 4 integers: " + sum(10, 20, 30, 40));
    }
}
