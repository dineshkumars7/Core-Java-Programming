package com.java.practice.polymorphism;
//---> Method overloading - Data types

class Printer {
    void print(int value) {
        System.out.println("Printing int    : " + value);
    }

    void print(double value) {
        System.out.println("Printing double : " + value);
    }

    void print(String value) {
        System.out.println("Printing String : " + value);
    }
}

public class P2_MethodOverloadingDataTypes {
	 public static void main(String[] args) {
	        Printer p = new Printer();
	        p.print(42);
	        p.print(99.95);
	        p.print("Hello Polymorphism");
	    }
}
