package com.java.practice.conditional_statements;

public class P10_AtmWithdrawal {
	public static void main(String[] args) {
        double accountBalance = 5000.00;
        double minimumBalance = 1000.00;
        double withdrawAmount = 3500.00;

        if (withdrawAmount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (withdrawAmount > accountBalance) {
            System.out.println("Transaction Failed: Insufficient balance.");
        } else if ((accountBalance - withdrawAmount) < minimumBalance) {
            System.out.println("Transaction Failed: Minimum balance of " + minimumBalance + " must be maintained.");
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("Withdrawal Successful! Amount withdrawn: " + withdrawAmount);
            System.out.println("Remaining Balance: " + accountBalance);
        }
    }
}
