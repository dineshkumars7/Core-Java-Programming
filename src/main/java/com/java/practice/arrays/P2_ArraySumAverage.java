package com.java.practice.arrays;

public class P2_ArraySumAverage {
	public static void main(String[] args) {
        int[] numbers = {15, 25, 35, 45, 50};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
    }
}
