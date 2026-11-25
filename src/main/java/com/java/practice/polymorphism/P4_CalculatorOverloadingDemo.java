package com.java.practice.polymorphism;


class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }
}
public class P4_CalculatorOverloadingDemo {
	  public static void main(String[] args) {
	        Calculator calc = new Calculator();
	        System.out.println("2 ints       : " + calc.add(10, 20));
	        System.out.println("3 ints       : " + calc.add(10, 20, 30));
	        System.out.println("2 doubles    : " + calc.add(12.5, 7.5));
	        System.out.println("int + double : " + calc.add(10, 5.5));
	    }
}
