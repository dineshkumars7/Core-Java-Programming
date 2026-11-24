package com.java.practice.number_programs;

//---Fibonacci series

//The Fibonacci series (or sequence) is an infinite series of numbers where each number is the sum of the two preceding ones. It usually starts with 0 and 1.
//
//How It Works
//
//To build the sequence, you add the last two numbers together to find the next number.
//• Formula: \(F_n = F_{n-1} + F_{n-2}\)
//• Starting values: \(F_0 = 0\) and \(F_1 = 1\)
//
//Step-by-Step Sequence
//
//Here is how the first few numbers in the sequence are calculated:
//• 0, 1 (Starting numbers)
//• 0 + 1 = 1
//• 1 + 1 = 2
//• 1 + 2 = 3
//• 2 + 3 = 5
//• 3 + 5 = 8
//• 5 + 8 = 13
//The beginning of the Fibonacci series looks like this:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...


public class P5_FibonacciSeries {
	 public static void main(String[] args) {
	        int n = 10;
	        int first = 0, second = 1;

	        System.out.print("Fibonacci Series (" + n + " terms): ");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	        }
	    }
}
