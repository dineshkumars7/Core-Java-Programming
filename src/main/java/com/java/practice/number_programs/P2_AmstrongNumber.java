package com.java.practice.number_programs;

//-----Amstrong number

//An Armstrong number (also known as a narcissistic number) is a number that equals the sum of its own digits, each raised to the power of the total number of digits.
//
//How It Works
//
//To check if a number is an Armstrong number, count how many digits it has (n). Then, raise each individual digit to the power of n and add them all together. If the final sum matches your original number, it is an Armstrong number.
//
//Examples
//
//• Single-digit numbers: Every single-digit number from 0 to 9 is an Armstrong number (5¹ = 5).
//• 3-digit example (153):
//	• Total digits = 3
//	• \(1^3 + 5^3 + 3^3 = 1 + 125 + 27 = \mathbf{153}\)
//	• Since the sum is 153, it is an Armstrong number.
//• 4-digit example (1634):
//	• Total digits = 4
//	• \(1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = \mathbf{1634}\)
//	• Since the sum is 1634, it is an Armstrong number.
//• Non-example (123):
//	• Total digits = 3
//	• 1³ + 2³ + 3³ = 1 + 8 + 27 = 36 (not equal to 123).
//
//Common Armstrong Numbers
//
//• 1-digit: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//• 2-digit: None exist
//• 3-digit: 153, 370, 371, 407
//• 4-digit: 1634, 8208, 9474



public class P2_AmstrongNumber {
	public static void main(String[] args) {
        int num = 153;
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if (original == sum) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
