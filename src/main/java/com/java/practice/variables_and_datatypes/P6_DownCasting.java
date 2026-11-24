package com.java.practice.variables_and_datatypes;

public class P6_DownCasting {
	public static void main(String[] args) {
        double doubleVal = 98.7654321987;

        // Explicit casting required from larger to smaller type
        float floatVal = (float) doubleVal;
        long longVal = (long) doubleVal;
        int intVal = (int) doubleVal;

        System.out.println("Original double : " + doubleVal);
        System.out.println("To float        : " + floatVal); // Precision loss
        System.out.println("To long         : " + longVal);   // Decimal truncated
        System.out.println("To int          : " + intVal);    // Decimal truncated
    }
}
