package com.java.practice.strings;

public class P10_FirstNonRepeatedChar {
	  public static void main(String[] args) {
	        String str = "swiss";
	        int[] freq = new int[256];

	        for (int i = 0; i < str.length(); i++) {
	            freq[str.charAt(i)]++;
	        }

	        char firstUnique = '\0';
	        for (int i = 0; i < str.length(); i++) {
	            if (freq[str.charAt(i)] == 1) {
	                firstUnique = str.charAt(i);
	                break;
	            }
	        }

	        if (firstUnique != '\0') {
	            System.out.println("First non-repeated character: " + firstUnique);
	        } else {
	            System.out.println("No non-repeated character found.");
	        }
	    }
}
