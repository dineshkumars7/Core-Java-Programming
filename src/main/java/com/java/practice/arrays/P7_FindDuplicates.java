package com.java.practice.arrays;

public class P7_FindDuplicates {
	 public static void main(String[] args) {
	        int[] arr = {4, 2, 7, 4, 8, 2, 9, 4};

	        System.out.print("Duplicate elements: ");
	        for (int i = 0; i < arr.length; i++) {
	            boolean alreadyPrinted = false;

	            // Check if this element appeared earlier
	            for (int k = 0; k < i; k++) {
	                if (arr[i] == arr[k]) {
	                    alreadyPrinted = true;
	                    break;
	                }
	            }

	            if (alreadyPrinted) continue;

	            // Check if it appears again later
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.print(arr[i] + " ");
	                    break;
	                }
	            }
	        }
	 }
}
