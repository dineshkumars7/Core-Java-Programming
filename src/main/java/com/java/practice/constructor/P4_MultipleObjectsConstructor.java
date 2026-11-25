package com.java.practice.constructor;

//--> Multiple objects
class Employeea {
    int id;
    String name;
    double salary;

    Employeea(int empId, String empName, double empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }

    void display() {
        System.out.println(id + " - " + name + " - ₹" + salary);
    }
}
public class P4_MultipleObjectsConstructor {
	 public static void main(String[] args) {
	        Employeea e1 = new Employeea(201, "Priya", 55000.0);
	        Employeea e2 = new Employeea(202, "Rohan", 68000.0);
	        Employeea e3 = new Employeea(203, "Sneha", 74000.0);

	        e1.display();
	        e2.display();
	        e3.display();
	    }
}
