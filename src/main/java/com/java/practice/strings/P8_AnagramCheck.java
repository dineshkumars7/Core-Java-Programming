package com.java.practice.strings;

import java.util.Arrays;

public class P8_AnagramCheck {
	public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Normalize case and remove spaces
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are Anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not Anagrams.");
        }
    }
}
