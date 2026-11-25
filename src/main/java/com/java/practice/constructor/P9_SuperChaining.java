package com.java.practice.constructor;

//Constructor chaining using super()
class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Parent (Person) constructor called.");
    }
}

class Manager extends Person {
    String department;

    Manager(String name, String department) {
        super(name); // Invokes parent class constructor
        this.department = department;
        System.out.println("Child (Manager) constructor called.");
    }

    void display() {
        System.out.println("Manager: " + name + " | Department: " + department);
    }
}
public class P9_SuperChaining {
	 public static void main(String[] args) {
	        Manager mgr = new Manager("Siddharth", "QA Automation");
	        mgr.display();
	    }
}
