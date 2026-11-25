package com.java.practice.arrays;

public class P3_ArrayMinMax {
	 public static void main(String[] args) {
	        int[] numbers = {42, 12, 89, 5, 67, 23};

	        int max = numbers[0];
	        int min = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	        }

	        System.out.println("Largest  : " + max);
	        System.out.println("Smallest : " + min);
	    }
}
