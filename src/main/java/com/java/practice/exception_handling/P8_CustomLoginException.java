package com.java.practice.exception_handling;

//Demonstrates creating a user-defined checked exception class and throwing it when login credentials fail validation.
//Custom Exception Class
class InvalidLoginException extends Exception {
 public InvalidLoginException(String message) {
     super(message);
 }
}

public class P8_CustomLoginException {
	 static void login(String username, String password) throws InvalidLoginException {
	        if (!username.equals("admin") || !password.equals("Pass@123")) {
	            throw new InvalidLoginException("Invalid credentials provided for user: " + username);
	        }
	        System.out.println("Login Successful! Welcome, " + username);
	    }

	    public static void main(String[] args) {
	        try {
	            login("admin", "WrongPassword");
	        } catch (InvalidLoginException e) {
	            System.out.println("Authentication Failed -> " + e.getMessage());
	        }
	    }
	 }
