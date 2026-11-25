package com.java.practice.strings;

public class P2_StringPalindrome {
	public static void main(String[] args) {
        String str = "madam";
        String lower = str.toLowerCase();
        boolean isPalindrome = true;

        int left = 0;
        int right = lower.length() - 1;

        while (left < right) {
            if (lower.charAt(left) != lower.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
}
