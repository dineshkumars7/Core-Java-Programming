package com.java.practice.arrays;

import java.util.Arrays;

public class P8_RemoveDuplicates {
	  public static void main(String[] args) {
	        int[] arr = {10, 20, 10, 30, 40, 20, 50};
	        int[] temp = new int[arr.length];
	        int uniqueCount = 0;

	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;

	            for (int j = 0; j < uniqueCount; j++) {
	                if (arr[i] == temp[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                temp[uniqueCount++] = arr[i];
	            }
	        }

	        // Copy only the unique elements into a right-sized array
	        int[] uniqueArray = Arrays.copyOf(temp, uniqueCount);
	        System.out.println("Unique Array: " + Arrays.toString(uniqueArray));
	    }
}
