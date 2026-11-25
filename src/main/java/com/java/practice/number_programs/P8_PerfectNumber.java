package com.java.practice.number_programs;

//----Perfect Number

//A perfect number is a positive integer that is equal to the sum of its proper positive divisors. Proper divisors are all the positive factors of the number, excluding the number itself.
//
//How It Works
//
//To check if a number is perfect, find every whole number that divides into it evenly (except the number itself). Add those divisors together. If the sum matches your original number, it is a perfect number.
//
//Examples
//
//• 6 (Smallest perfect number):
//	• Proper divisors of 6: 1, 2, and 3
//	• Sum: 1 + 2 + 3 = 6
//	• Since the sum equals 6, it is a perfect number.
//• 28 (Second perfect number):
//	• Proper divisors of 28: 1, 2, 4, 7, and 14
//	• Sum: 1 + 2 + 4 + 7 + 14 = 28
//	• Since the sum equals 28, it is a perfect number.
//• Non-example (12):
//	• Proper divisors of 12: 1, 2, 3, 4, and 6
//	• Sum: 1 + 2 + 3 + 4 + 6 = 16 (not equal to 12, making it an abundant number).


public class P8_PerfectNumber {
	 public static void main(String[] args) {
	        int num = 6;
	        int sum = 0;

	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }

	        if (num > 0 && sum == num) {
	            System.out.println(num + " is a Perfect number.");
	        } else {
	            System.out.println(num + " is not a Perfect number.");
	        }
	    }
}
