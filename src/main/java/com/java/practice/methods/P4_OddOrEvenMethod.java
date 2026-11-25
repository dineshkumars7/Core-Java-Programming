package com.java.practice.methods;

public class P4_OddOrEvenMethod {
	static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int number = 19;
        System.out.println(number + " is " + checkEvenOdd(number));
    }
}
