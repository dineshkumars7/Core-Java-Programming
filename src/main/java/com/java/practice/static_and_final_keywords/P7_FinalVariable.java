package com.java.practice.static_and_final_keywords;

class Employee {
    final String ORGANIZATION = "Global Tech"; // Initialized at declaration
    final int employeeId;                      // Blank final variable

    Employee(int id) {
        this.employeeId = id; // Initialized inside constructor
    }

    void display() {
        // employeeId = 999; // COMPILE ERROR: Cannot assign a value to final variable
        System.out.println("Org: " + ORGANIZATION + " | ID: " + employeeId);
    }
}

public class P7_FinalVariable {
	 public static void main(String[] args) {
	        Employee emp1 = new Employee(101);
	        Employee emp2 = new Employee(102);

	        emp1.display();
	        emp2.display();
	    }
}
