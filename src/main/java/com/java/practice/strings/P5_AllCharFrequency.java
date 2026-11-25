package com.java.practice.strings;

public class P5_AllCharFrequency {
	public static void main(String[] args) {
        String str = "banana";
        int[] freq = new int[256]; // ASCII frequency array

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] != 0) {
                System.out.println(ch + " : " + freq[ch]);
                freq[ch] = 0; // Reset to avoid duplicate printing
            }
        }
    }
}
