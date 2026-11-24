package com.java.practice.number_programs;

//----Prime number


//A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. In simpler terms, it is a whole number that cannot be formed by multiplying two smaller whole numbers together.
//
//Key Rules and Facts
//
//• Must be greater than 1: The numbers 0 and 1 are not prime numbers.
//• Only two factors: Every prime number has exact two distinct factors, which are 1 and the number itself.
//• Composite numbers: Whole numbers greater than 1 that are not prime are called composite numbers because they have more than two factors.
//• The number 2: 2 is the smallest prime number and the only even prime number. Every other even number can be divided by 2.
//
//Examples
//
//• Prime numbers: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31...
//• Why 7 is prime: The only whole numbers that divide evenly into 7 are 1 and 7.
//• Why 9 is not prime: 9 can be divided by 1, 3, and 9 (since 3 × 3 = 9), making it a composite number.

public class P3_PrimeNumberCheck {

	public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }
    }
}
