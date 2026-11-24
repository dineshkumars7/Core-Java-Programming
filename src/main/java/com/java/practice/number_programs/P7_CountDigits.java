package com.java.practice.number_programs;

public class P7_CountDigits {
	 public static void main(String[] args) {
	        int num = 987654;
	        int count = 0;

	        if (num == 0) {
	            count = 1;
	        } else {
	            while (num != 0) {
	                num /= 10;
	                count++;
	            }
	        }

	        System.out.println("Number of digits: " + count);
	    }
}
