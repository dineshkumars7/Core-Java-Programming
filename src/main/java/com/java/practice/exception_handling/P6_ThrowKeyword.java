package com.java.practice.exception_handling;

public class P6_ThrowKeyword {
	static void validateVoterAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Access Denied: Age must be 18 or older. Provided: " + age);
        }
        System.out.println("Eligible to vote! Age: " + age);
    }

    public static void main(String[] args) {
        try {
            validateVoterAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Manual Exception -> " + e.getMessage());
        }
    }
}
