package com.java.practice.exception_handling;

public class P5_FinallyBlock {
	static void runTestCase(boolean triggerError) {
        System.out.println("\n--- Starting Test (triggerError = " + triggerError + ") ---");
        try {
            System.out.println("1. Opening database connection...");
            if (triggerError) {
                int fail = 10 / 0;
            }
            System.out.println("2. Query executed successfully.");
        } catch (ArithmeticException e) {
            System.out.println("2. Error occurred during query execution.");
        } finally {
            System.out.println("3. [FINALLY] Closing database connection (Always runs).");
        }
    }

    public static void main(String[] args) {
        runTestCase(false); // Without exception
        runTestCase(true);  // With exception
    }
}
