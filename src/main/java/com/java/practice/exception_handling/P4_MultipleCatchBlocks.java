package com.java.practice.exception_handling;

public class P4_MultipleCatchBlocks {
	 public static void main(String[] args) {
	        int[] numbers = {10, 20, 30};
	        String str = null;

	        try {
	            // Change lines below to test different exceptions
	            int division = numbers[1] / 0;         // Triggers ArithmeticException
	            System.out.println(numbers[10]);       // Triggers ArrayIndexOutOfBoundsException
	            System.out.println(str.toUpperCase()); // Triggers NullPointerException

	        } catch (ArithmeticException e) {
	            System.out.println("Handled ArithmeticException: Division by zero.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Handled ArrayIndexOutOfBoundsException: Index out of range.");
	        } catch (NullPointerException e) {
	            System.out.println("Handled NullPointerException: Null object encountered.");
	        } catch (Exception e) {
	            System.out.println("Handled General Exception: " + e.getMessage());
	        }
	    }
}
