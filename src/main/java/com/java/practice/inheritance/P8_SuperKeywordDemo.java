package com.java.practice.inheritance;
//Super keyword
class ParentAccount {
    String accountType = "General Account";

    void displayType() {
        System.out.println("Parent Account Type: " + accountType);
    }
}

class SavingsAccount extends ParentAccount {
    String accountType = "Savings Account";

    void showDetails() {
        System.out.println("Child Variable  : " + accountType);
        System.out.println("Parent Variable : " + super.accountType);
        super.displayType(); // Calls parent method
    }
}

public class P8_SuperKeywordDemo {
	 public static void main(String[] args) {
	        SavingsAccount sa = new SavingsAccount();
	        sa.showDetails();
	    }
}
