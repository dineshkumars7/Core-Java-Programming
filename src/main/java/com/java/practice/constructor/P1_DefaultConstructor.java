package com.java.practice.constructor;
//Default Constructor
class Device {
    String brand;
    int warrantyYears;

    // Explicitly declared default (no-arg) constructor
    Device() {
        brand = "Generic";
        warrantyYears = 1;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Warranty: " + warrantyYears + " year(s)");
    }
}
public class P1_DefaultConstructor {
	public static void main(String[] args) {
        Device d = new Device();
        d.display();
    }
}
