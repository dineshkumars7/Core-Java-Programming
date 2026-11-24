package com.java.practice.operators;

public class P8_AssignmentOperators {
	public static void main(String[] args) {
        int num = 20;

        num += 5;  // num = 25
        System.out.println("After += 5 : " + num);

        num -= 3;  // num = 22
        System.out.println("After -= 3 : " + num);

        num *= 2;  // num = 44
        System.out.println("After *= 2 : " + num);

        num /= 4;  // num = 11
        System.out.println("After /= 4 : " + num);

        num %= 3;  // num = 2
        System.out.println("After %= 3 : " + num);
    }
}
