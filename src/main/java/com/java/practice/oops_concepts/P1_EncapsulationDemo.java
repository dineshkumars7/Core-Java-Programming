package com.java.practice.oops_concepts;

class Employee {
    private int id;
    private String name;
    private double salary;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

public class P1_EncapsulationDemo {
	public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Ananya");
        emp.setSalary(65000.0);

        System.out.println("ID     : " + emp.getId());
        System.out.println("Name   : " + emp.getName());
        System.out.println("Salary : " + emp.getSalary());
    }
}
