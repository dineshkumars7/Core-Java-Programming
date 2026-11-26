package com.java.practice.abstraction;



abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}


public class P3_EmployeeAbstractionDemo {
	public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Karthik", 65000.0);
        Employee emp2 = new PartTimeEmployee("Divya", 80, 450.0);

        System.out.println(emp1.name + " Salary: ₹" + emp1.calculateSalary());
        System.out.println(emp2.name + " Salary: ₹" + emp2.calculateSalary());
    }
}
