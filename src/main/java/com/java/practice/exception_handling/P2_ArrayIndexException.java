package com.java.practice.exception_handling;

public class P2_ArrayIndexException {
	 public static void main(String[] args) {
	        String[] browsers = {"Chrome", "Firefox", "Edge"};

	        try {
	            // Valid indices are 0, 1, 2
	            System.out.println("Selected Browser: " + browsers[5]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Exception Caught: Invalid array index accessed.");
	            System.out.println("Valid index range is 0 to " + (browsers.length - 1));
	        }
	    }
}
