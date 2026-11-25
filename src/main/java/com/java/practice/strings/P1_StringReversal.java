package com.java.practice.strings;

public class P1_StringReversal {
	public static void main(String[] args) {
        String str = "JavaProgramming";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original : " + str);
        System.out.println("Reversed : " + reversed);
    }
}
