package com.java.practice.polymorphism;

class Bank {
    double getInterestRate() {
        return 4.5;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 6.75;
    }
}


public class P7_RuntimePolymorphismBasic {
	 public static void main(String[] args) {
	        // Parent reference pointing to child object
	        Bank bankRef = new ICICI();
	        System.out.println("Interest Rate: " + bankRef.getInterestRate() + "%");
	    }
}
