package com.java.practice.strings;

public class P3_CountVowelsConsonants {
	 public static void main(String[] args) {
	        String str = "Hello World 123";
	        String lower = str.toLowerCase();
	        int vowels = 0, consonants = 0;

	        for (int i = 0; i < lower.length(); i++) {
	            char ch = lower.charAt(i);

	            if (ch >= 'a' && ch <= 'z') {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Vowels     : " + vowels);
	        System.out.println("Consonants : " + consonants);
	    }
}
