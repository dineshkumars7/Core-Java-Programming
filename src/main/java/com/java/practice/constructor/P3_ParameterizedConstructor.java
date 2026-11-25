package com.java.practice.constructor;
//--> Parameterized constructor

class Employee {
    int id;
    String name;
    double salary;

    Employee(int empId, String empName, double empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: " + salary);
    }
}
public class P3_ParameterizedConstructor {
	  public static void main(String[] args) {
	        Employee emp = new Employee(101, "Arjun", 62000.0);
	        emp.display();
	    }
}
