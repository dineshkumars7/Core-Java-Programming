package com.java.practice.oops_concepts;

	class Employeee {
	    private double salary;
	    protected String name;

	    public Employeee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public double getSalary() {
	        return salary;
	    }
	}

	class Manager extends Employeee {
	    private String department;

	    public Manager(String name, double salary, String department) {
	        super(name, salary);
	        this.department = department;
	    }

	    public void displayDetails() {
	        // 'name' is directly accessible (protected); 'salary' is accessed via getter (private)
	        System.out.println("Manager: " + name + " | Dept: " + department + " | Salary: " + getSalary());
	    }
	}

	public class P5_InheritanceEncapsulationDemo {
	    public static void main(String[] args) {
	        Manager mgr = new Manager("Vikram", 95000.0, "Product Engineering");
	        mgr.displayDetails();
	    }
	}
