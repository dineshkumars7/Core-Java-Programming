package com.java.practice.encapsulation;


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit failed: Amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Withdrawal failed: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}



public class P3_BankAccpuntEncapsulation {
	public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0);
        account.deposit(1500.0);
        account.withdraw(2000.0);
        account.withdraw(6000.0); // Rejected
        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
