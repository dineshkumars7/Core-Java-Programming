package com.java.practice.methods;

public class P10_RecursiveFibonacci {
	static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: fib(0) = 0, fib(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int term = 7;
        System.out.println("Fibonacci number at position " + term + " is: " + fibonacci(term));

        System.out.print("Series up to " + term + " terms: ");
        for (int i = 0; i < term; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
