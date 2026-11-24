package com.java.practice.number_programs;

//-----Palindrome number

//A palindrome number (or palindromic number) is a number that reads the same forwards and backwards. In other words, its value stays identical when you reverse its digits.
//
//Examples
//
//• Single-digit numbers: All single-digit numbers (0 through 9) are palindromes.
//• Two-digit numbers: 11, 22, 33, 44, 55, 66, 77, 88, 99
//• Multi-digit numbers: 121, 313, 4554, 16361, 89098


public class P1_PalindromeNumber {
	 public static void main(String[] args) {
	        int num = 121;
	        int original = num;
	        int reversed = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        if (original == reversed) {
	            System.out.println(original + " is a Palindrome number.");
	        } else {
	            System.out.println(original + " is not a Palindrome number.");
	        }
	    }
}
