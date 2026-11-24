package com.java.practice.operators;

public class P2_EvenOrOdd {
    public static void main(String[] args) {
        int number = 17;

        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
}
