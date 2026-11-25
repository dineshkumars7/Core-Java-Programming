package com.java.practice.constructor;
//--> this keyword
class Account {
    int accountNumber;
    String holderName;
    double balance;

    Account(int accountNumber, String holderName, double balance) {
        // 'this' differentiates instance variables from local parameters
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void showDetails() {
        System.out.println("Account No: " + this.accountNumber + ", Holder: " + this.holderName + ", Balance: " + this.balance);
    }
}


public class P7_ThisKeyword {
	public static void main(String[] args) {
        Account acc = new Account(98765, "Divya", 15000.0);
        acc.showDetails();
    }
}
