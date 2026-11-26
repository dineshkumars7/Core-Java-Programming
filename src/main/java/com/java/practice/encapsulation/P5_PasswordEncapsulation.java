package com.java.practice.encapsulation;

class UserCredentials {
    private String password;

    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
            System.out.println("Password successfully updated.");
        } else {
            System.out.println("Security Error: Password must be at least 8 characters long.");
        }
    }

    public boolean verifyPassword(String input) {
        return password != null && password.equals(input);
    }
}
public class P5_PasswordEncapsulation {
	  public static void main(String[] args) {
	        UserCredentials user = new UserCredentials();
	        user.setPassword("12345");          // Rejected
	        user.setPassword("SecurePass@2026"); // Accepted
	        System.out.println("Login check: " + user.verifyPassword("SecurePass@2026"));
	    }
}
