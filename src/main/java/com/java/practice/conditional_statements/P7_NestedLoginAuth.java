package com.java.practice.conditional_statements;

public class P7_NestedLoginAuth {
	 public static void main(String[] args) {
	        String validUser = "student01";
	        String validPass = "java@2026";

	        String enteredUser = "student01";
	        String enteredPass = "java@2026";

	        if (enteredUser.equals(validUser)) {
	            if (enteredPass.equals(validPass)) {
	                System.out.println("Login Successful! Welcome, " + enteredUser + ".");
	            } else {
	                System.out.println("Authentication Failed: Incorrect Password.");
	            }
	        } else {
	            System.out.println("Authentication Failed: Username not found.");
	        }
	    }
}
