package com.java.practice.arrays;

public class P10_MatrixAddition {
	 public static void main(String[] args) {
	        int[][] matrixA = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        int[][] matrixB = {
	            {7, 8, 9},
	            {10, 11, 12}
	        };

	        int rows = matrixA.length;
	        int cols = matrixA[0].length;
	        int[][] sumMatrix = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }

	        System.out.println("Resulting Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(sumMatrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
}
