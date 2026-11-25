package com.java.practice.oops_concepts;

//--> Combined OOp

//Abstraction
abstract class Staff {
 // Encapsulation
 private int id;
 private String name;

 public Staff(int id, String name) {
     this.id = id;
     this.name = name;
 }

 public int getId() { return id; }
 public String getName() { return name; }

 public abstract double calculatePay();
}

//Inheritance
class FullTimeEmployee extends Staff {
 private double monthlySalary;

 public FullTimeEmployee(int id, String name, double monthlySalary) {
     super(id, name);
     this.monthlySalary = monthlySalary;
 }

 @Override
 public double calculatePay() {
     return monthlySalary;
 }
}

class ContractEmployee extends Staff {
 private int hoursWorked;
 private double hourlyRate;

 public ContractEmployee(int id, String name, int hoursWorked, double hourlyRate) {
     super(id, name);
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 @Override
 public double calculatePay() {
     return hoursWorked * hourlyRate;
 }
}
public class P9_EmployeeManagementApp {
	public static void main(String[] args) {
        // Polymorphism
        Staff[] employees = {
            new FullTimeEmployee(1, "Meera", 70000.0),
            new ContractEmployee(2, "Karthik", 120, 500.0)
        };

        for (Staff emp : employees) {
            System.out.println("ID: " + emp.getId() + " | Name: " + emp.getName() + " | Pay: ₹" + emp.calculatePay());
        }
    }
}
