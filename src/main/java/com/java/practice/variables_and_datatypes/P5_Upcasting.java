package com.java.practice.variables_and_datatypes;

public class P5_Upcasting {
	 public static void main(String[] args) {
	        int intVal = 250;

	        // Implicit (automatic) casting from smaller to larger type
//	        Also called as Widening casting
	        long longVal = intVal;
	        float floatVal = intVal;
	        double doubleVal = intVal;

	        System.out.println("Original int : " + intVal);
	        System.out.println("To long      : " + longVal);
	        System.out.println("To float     : " + floatVal);
	        System.out.println("To double    : " + doubleVal);
	    }
}
