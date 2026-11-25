package com.java.practice.strings;

public class P6_RemoveSpaces {
	public static void main(String[] args) {
        String str = "Java is fun to learn";
        String noSpaces = str.replace(" ", "");

        System.out.println("Original : " + str);
        System.out.println("Modified : " + noSpaces);
    }
}
