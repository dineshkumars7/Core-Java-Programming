package com.java.practice.strings;

public class P7_DuplicateCharacters {
	public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.print("Duplicate characters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > 1) {
                System.out.print(ch + " ");
                freq[ch] = 0; // Ensure each duplicate prints once
            }
        }
}
}
