package com.java.practice.strings;

public class P9_WordCount {
	 public static void main(String[] args) {
	        String sentence = "   Java programming builds strong logic   ";
	        String trimmed = sentence.trim();

	        if (trimmed.isEmpty()) {
	            System.out.println("Word count: 0");
	        } else {
	            // Split on one or more whitespace characters
	            String[] words = trimmed.split("\\s+");
	            System.out.println("Word count: " + words.length);
	        }
	    }
}
