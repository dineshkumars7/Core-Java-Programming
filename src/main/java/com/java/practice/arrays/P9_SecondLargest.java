package com.java.practice.arrays;

public class P9_SecondLargest {
	 public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 10, 34, 35, 1};

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("No distinct second largest element found.");
	        } else {
	            System.out.println("Second Largest: " + secondLargest);
	        }
	    }
}
