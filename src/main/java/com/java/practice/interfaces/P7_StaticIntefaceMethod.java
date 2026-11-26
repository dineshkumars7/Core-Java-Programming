package com.java.practice.interfaces;

interface MathUtils {
    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }
}
public class P7_StaticIntefaceMethod {
	public static void main(String[] args) {
        // Invoked directly using the interface name
        System.out.println("Square of 5 : " + MathUtils.square(5));
        System.out.println("Cube of 3   : " + MathUtils.cube(3));
    }
}
