package com.java.practice.access_modifiers;

class BankAccount {
    private double balance = 50000.00;

    private void showSecretPin() {
        System.out.println("PIN: 4321");
    }

    public void displayBalance() {
        // Accessible within the same class
        System.out.println("Balance: ₹" + balance);
        showSecretPin();
    }
}
public class P2_PrivateAccess {
	public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // UNCOMMENTING THESE LINES WILL CAUSE COMPILE ERRORS:
        // System.out.println(account.balance); // Error: balance has private access
        // account.showSecretPin();             // Error: showSecretPin() has private access

        account.displayBalance(); // Allowed via public method
    }
}
