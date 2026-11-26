package com.java.practice.exception_handling;
//Demonstrates an exception propagating up the call stack from step3() → step2() → step1() until it is caught and handled at the top level.
public class P9_ExceptionPropagation {
	void step3_ClickButton() {
        System.out.println("Executing Step 3: Performing calculation...");
        int crash = 100 / 0; // Unchecked exception originates here
    }

    void step2_FillForm() {
        System.out.println("Executing Step 2: Calling Step 3...");
        step3_ClickButton(); // Not caught here; propagates up
    }

    void step1_OpenPage() {
        System.out.println("Executing Step 1: Calling Step 2...");
        step2_FillForm(); // Not caught here; propagates up
    }

    public static void main(String[] args) {
        P9_ExceptionPropagation flow = new P9_ExceptionPropagation();
        try {
            flow.step1_OpenPage();
        } catch (ArithmeticException e) {
            System.out.println("Exception propagated all the way to main() and handled safely: " + e);
        }
    }
}
