package com.java.practice.operators;

public class P6_LoginValidation {
	  public static void main(String[] args) {
	        String storedUser = "admin";
	        String storedPass = "pass123";

	        String inputUser = "admin";
	        String inputPass = "pass123";

	        boolean isValid = storedUser.equals(inputUser) && storedPass.equals(inputPass);
	        System.out.println("Login Successful: " + isValid);
	    }
}
