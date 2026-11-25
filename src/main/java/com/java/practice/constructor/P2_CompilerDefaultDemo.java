package com.java.practice.constructor;
//Compiler provided default

class SampleItem {
    int code;          // Defaults to 0
    double price;      // Defaults to 0.0
    boolean inStock;   // Defaults to false
    String label;      // Defaults to null
}

public class P2_CompilerDefaultDemo {
	public static void main(String[] args) {
        // Compiler automatically supplies a no-arg constructor
        SampleItem item = new SampleItem();

        System.out.println("code    : " + item.code);
        System.out.println("price   : " + item.price);
        System.out.println("inStock : " + item.inStock);
        System.out.println("label   : " + item.label);
    }
}
