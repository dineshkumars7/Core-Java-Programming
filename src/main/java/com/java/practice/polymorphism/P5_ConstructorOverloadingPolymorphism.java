package com.java.practice.polymorphism;
//--> constructor overloading

class Employee {
    int id;
    String name;
    String role;

    Employee() {
        this.id = 0;
        this.name = "Unassigned";
        this.role = "Trainee";
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.role = "Associate";
    }

    Employee(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Role: " + role);
    }
}

public class P5_ConstructorOverloadingPolymorphism {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Rohan");
        Employee e3 = new Employee(102, "Meera", "QA Lead");

        e1.display();
        e2.display();
        e3.display();
    }
}
