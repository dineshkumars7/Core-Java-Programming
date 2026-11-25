package com.java.practice.oops_concepts;


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal failed: Invalid amount or insufficient balance.");
        }
    }
}

public class P2_EncapsulationValidationDemo {
	 public static void main(String[] args) {
	        BankAccount account = new BankAccount(5000.0);
	        account.deposit(-200.0);
	        account.deposit(1500.0);
	        account.withdraw(8000.0);
	        account.withdraw(2000.0);
	        System.out.println("Final Balance: " + account.getBalance());
	    }
}

