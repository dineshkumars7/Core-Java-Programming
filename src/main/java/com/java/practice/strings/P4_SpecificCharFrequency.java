package com.java.practice.strings;

public class P4_SpecificCharFrequency {
	 public static void main(String[] args) {
	        String str = "programming";
	        char target = 'g';
	        int count = 0;

	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == target) {
	                count++;
	            }
	        }

	        System.out.println("Frequency of '" + target + "' in \"" + str + "\": " + count);
	    }
}
