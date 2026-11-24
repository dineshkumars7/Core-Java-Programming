package com.java.practice.operators;

public class P4_VotingEligibility {
	 public static void main(String[] args) {
	        int age = 20;
	        boolean isCitizen = true;

	        boolean isEligible = (age >= 18) && isCitizen;
	        System.out.println("Eligible to vote: " + isEligible);
	    }
}
