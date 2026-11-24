package com.java.practice.conditional_statements;

public class P6_VowelOrConsonant {
	  public static void main(String[] args) {
	        char ch = 'E';
	        char lowerCh = Character.toLowerCase(ch);

	        if (lowerCh >= 'a' && lowerCh <= 'z') {
	            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
	                System.out.println(ch + " is a Vowel.");
	            } else {
	                System.out.println(ch + " is a Consonant.");
	            }
	        } else {
	            System.out.println(ch + " is not a valid alphabet.");
	        }
	    }
}
