package com.java.practice.access_modifiers;


class Vehicle {
    protected String fuelType = "Electric";

    protected void startEngine() {
        System.out.println("Starting " + fuelType + " motor...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Fuel: " + fuelType); // Inherited & accessible
        startEngine();                           // Inherited & accessible
    }
}


public class P4_ProtectedAccess {
	  public static void main(String[] args) {
	        Car myCar = new Car();
	        myCar.drive();
	    }
}
