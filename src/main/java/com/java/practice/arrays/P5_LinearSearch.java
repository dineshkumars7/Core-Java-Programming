package com.java.practice.arrays;

public class P5_LinearSearch {
	 public static void main(String[] args) {
	        int[] arr = {14, 28, 35, 42, 56, 70};
	        int target = 42;
	        int foundIndex = -1;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                foundIndex = i;
	                break;
	            }
	        }

	        if (foundIndex != -1) {
	            System.out.println(target + " found at index: " + foundIndex);
	        } else {
	            System.out.println(target + " not found in the array.");
	        }
	    }
}
