package com.java.practice.fundamentals;
/**
 * The I05_JavaDocumentation class provides basic utility operations
 * for salary calculations and demonstrates standard JavaDoc conventions.
 *
 * @author Developer
 * @version 1.0
 */
public class P10_JavaDocumentation {

    /**
     * Calculates the annual bonus based on base salary and bonus percentage.
     *
     * @param baseSalary      The employee's annual base salary.
     * @param bonusPercentage The bonus percentage to apply (e.g., 10 for 10%).
     * @return The calculated bonus amount.
     */
    public double calculateBonus(double baseSalary, double bonusPercentage) {
        return baseSalary * (bonusPercentage / 100.0);
    }

    /**
     * The main entry point of the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        P10_JavaDocumentation payroll = new P10_JavaDocumentation();
        double bonus = payroll.calculateBonus(60000.00, 12.5);
        System.out.printf("Calculated Annual Bonus: %.2f%n", bonus);
    }
}