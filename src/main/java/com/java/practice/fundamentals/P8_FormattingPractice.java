package com.java.practice.fundamentals;

public class P8_FormattingPractice {
	public static void main(String[] args) {
        System.out.println("+--------+--------------------+--------------------+------------+");
        System.out.printf("| %-6s | %-18s | %-18s | %-10s |%n", "EMP ID", "NAME", "DEPARTMENT", "SALARY");
        System.out.println("+--------+--------------------+--------------------+------------+");
        System.out.printf("| %-6d | %-18s | %-18s | %10.2f |%n", 201, "Vikram Nair", "Data Science", 95000.00);
        System.out.printf("| %-6d | %-18s | %-18s | %10.2f |%n", 202, "Sneha Kulkarni", "Cybersecurity", 88500.50);
        System.out.printf("| %-6d | %-18s | %-18s | %10.2f |%n", 203, "Rohan Das", "DevOps", 91200.75);
        System.out.println("+--------+--------------------+--------------------+------------+");
    }
}
