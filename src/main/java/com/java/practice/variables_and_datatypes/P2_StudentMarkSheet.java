package com.java.practice.variables_and_datatypes;

public class P2_StudentMarkSheet {
	 public static void main(String[] args) {
	        int sub1 = 85, sub2 = 90, sub3 = 78, sub4 = 88, sub5 = 92;

	        int total = sub1 + sub2 + sub3 + sub4 + sub5;
	        double average = total / 5.0; // Use 5.0 to avoid integer division

	        System.out.println("Total Marks   : " + total);
	        System.out.println("Average Marks : " + average);
	    }
}
