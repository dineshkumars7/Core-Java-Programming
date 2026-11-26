package com.java.practice.exception_handling;

public class P3_NullPointerException {
	public static void main(String[] args) {
        String elementText = null;

        try {
            System.out.println("Text length: " + elementText.length());
        } catch (NullPointerException e) {
            System.out.println("Exception Caught: Attempted to invoke a method on a null reference.");
        }
    }
}
