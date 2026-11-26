package com.java.practice.encapsulation;


class EmployeeRecord {
    private int id;
    private String name;
    private String department;
    private double salary;

    public int getId() { return id; }
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID: Must be greater than 0.");
        }
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid Name: Cannot be empty.");
        }
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) {
        if (department != null && !department.trim().isEmpty()) {
            this.department = department;
        } else {
            System.out.println("Invalid Department: Cannot be empty.");
        }
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary: Must be at least 10,000.");
        }
    }
}



public class P8_MultiFieldEncapsulation {
	 public static void main(String[] args) {
	        EmployeeRecord emp = new EmployeeRecord();
	        emp.setId(501);
	        emp.setName("Vikram");
	        emp.setDepartment("Quality Assurance");
	        emp.setSalary(5000);  // Rejected
	        emp.setSalary(72000); // Accepted

	        System.out.println("ID: " + emp.getId() + " | Name: " + emp.getName()
	                + " | Dept: " + emp.getDepartment() + " | Salary: " + emp.getSalary());
	    }
}
