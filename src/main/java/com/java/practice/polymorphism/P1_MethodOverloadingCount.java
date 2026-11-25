package com.java.practice.polymorphism;

//--> method overloading

class MathOperations {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class P1_MethodOverloadingCount {
	 public static void main(String[] args) {
	        MathOperations math = new MathOperations();
	        System.out.println("Product of 2 numbers : " + math.multiply(4, 5));
	        System.out.println("Product of 3 numbers : " + math.multiply(2, 3, 4));
	    }
}
