package com.java.practice.interfaces;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class P2_MultipleInterface {
	 public static void main(String[] args) {
	        AllInOnePrinter device = new AllInOnePrinter();
	        device.print();
	        device.scan();
	    }
}
