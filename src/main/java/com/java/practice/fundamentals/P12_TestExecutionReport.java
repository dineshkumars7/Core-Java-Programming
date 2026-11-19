
package com.java.practice.fundamentals;

public class P12_TestExecutionReport {

    public static void main(String[] args) {

        int totalTests = 20;
        int passedTests = 15;
        int failedTests = 3;
        int skippedTests = 2;

        System.out.println("====================================");
        System.out.println("       TEST EXECUTION REPORT");
        System.out.println("====================================");

        System.out.printf("%-20s : %d%n", "Total Test Cases", totalTests);
        System.out.printf("%-20s : %d%n", "Passed Test Cases", passedTests);
        System.out.printf("%-20s : %d%n", "Failed Test Cases", failedTests);
        System.out.printf("%-20s : %d%n", "Skipped Test Cases", skippedTests);

        System.out.println("------------------------------------");

        double passPercentage =
                (passedTests * 100.0) / totalTests;

        System.out.printf("%-20s : %.2f%%%n",
                "Pass Percentage", passPercentage);

        System.out.println("====================================");
    }
}
