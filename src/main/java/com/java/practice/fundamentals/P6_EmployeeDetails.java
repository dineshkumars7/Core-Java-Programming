package com.java.practice.fundamentals;

public class P6_EmployeeDetails {
	public static void main(String[] args) {
        int empId = 1042;
        String name = "Dineshkumar";
        String department = "Quality Engineer";
        String designation = "Manual Tester";

        System.out.println("=========================================");
        System.out.println("            EMPLOYEE DETAILS             ");
        System.out.println("=========================================");
        System.out.printf("%-15s : %d%n", "Employee ID", empId);
        System.out.printf("%-15s : %s%n", "Name", name);
        System.out.printf("%-15s : %s%n", "Department", department);
        System.out.printf("%-15s : %s%n", "Designation", designation);
        System.out.println("=========================================");
    }
}
