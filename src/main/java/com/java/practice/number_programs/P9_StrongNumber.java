package com.java.practice.number_programs;

//---Strong number

//A strong number (also known as a Krishnamurthy number or factorion) is a special number where the sum of the factorials of its individual digits equals the original number itself.
//
//How It Works
//
//To check if a number is a strong number, separate it into its individual digits. Find the factorial of each digit (multiplying all whole numbers from that digit down to 1). Add those factorials together. If the final sum matches your original number, it is a strong number.
//(Note: By mathematical rule, the factorial of 0 is 1, written as \(0! = 1\).)
//
//Examples
//
//• 145 (Most common example):
//	• Break into digits: 1, 4, and 5
//	• Calculate factorials: \(1! = 1\), \(4! = 4 \times 3 \times 2 \times 1 = 24\), and \(5! = 5 \times 4 \times 3 \times 2 \times 1 = 120\)
//	• Sum: \(1 + 24 + 120 = \mathbf{145}\)
//	• Since the sum matches 145, it is a strong number.
//• 2 (Single-digit example):
//	• Factorial of 2: \(2! = 2 \times 1 = \mathbf{2}\)
//	• Since the sum matches 2, it is a strong number.
//• Non-example (123):
//	• Calculate factorials: \(1! = 1\), \(2! = 2\), and \(3! = 6\)
//	• Sum: \(1 + 2 + 6 = 9\) (not equal to 123).
//
//All Known Strong Numbers
//
//Unlike prime or palindrome numbers, strong numbers are strictly finite in base 10. There are only four strong numbers in existence:
//• 1 (\(1! = 1\))
//• 2 (\(2! = 2\))
//• 145 (\(1! + 4! + 5! = 145\))
//• 40585 (\(4! + 0! + 5! + 8! + 5! = 24 + 1 + 120 + 40320 + 120 = 40585\))


public class P9_StrongNumber {
	 public static void main(String[] args) {
	        int num = 145;
	        int original = num;
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            int fact = 1;

	            for (int i = 1; i <= digit; i++) {
	                fact *= i;
	            }

	            sum += fact;
	            num /= 10;
	        }

	        if (original == sum) {
	            System.out.println(original + " is a Strong number.");
	        } else {
	            System.out.println(original + " is not a Strong number.");
	        }
	    }
}
