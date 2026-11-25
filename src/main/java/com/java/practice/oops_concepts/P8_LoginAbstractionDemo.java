package com.java.practice.oops_concepts;

//-----> Interface based abstraction

interface Login {
    boolean authenticate(String credential);
}

class PasswordLogin implements Login {
    @Override
    public boolean authenticate(String password) {
        System.out.println("Verifying password...");
        return "pass@123".equals(password);
    }
}

class OtpLogin implements Login {
    @Override
    public boolean authenticate(String otp) {
        System.out.println("Verifying 6-digit OTP...");
        return "482910".equals(otp);
    }
}

public class P8_LoginAbstractionDemo {
	 public static void main(String[] args) {
	        Login passAuth = new PasswordLogin();
	        System.out.println("Password Login Status: " + passAuth.authenticate("pass@123"));

	        Login otpAuth = new OtpLogin();
	        System.out.println("OTP Login Status: " + otpAuth.authenticate("482910"));
	    }
}
