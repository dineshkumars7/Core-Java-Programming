package com.java.practice.abstraction;

abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Holder: " + accountHolder + " | Balance: ₹" + balance);
    }

    abstract void calculateInterest();
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    void calculateInterest() {
        double interest = balance * (interestRate / 100);
        System.out.println("Annual Interest Earned: ₹" + interest);
    }
}
public class P6_AbstractFieldDemo {
	 public static void main(String[] args) {
	        SavingsAccount sa = new SavingsAccount("Ananya", 50000.0, 6.0);
	        sa.displayBalance();
	        sa.calculateInterest();
	    }
}
