package com.java.practice.inheritance;
//Single inheritance
class Employee {
    int id = 101;
    String name = "Aarav";

    void showEmployeeInfo() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}

class Manager extends Employee {
    String department = "Engineering";

    void showManagerInfo() {
        showEmployeeInfo();
        System.out.println("Department: " + department);
    }
}
public class P2_EmployeeInheritanceDemo {
	public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.showManagerInfo();
    }
}
