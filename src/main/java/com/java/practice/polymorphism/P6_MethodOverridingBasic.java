package com.java.practice.polymorphism;

//--> Method overriding
class Vehicle {
    void run() {
        System.out.println("Vehicle is running safely.");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running smoothly at 80 km/h.");
    }
}
public class P6_MethodOverridingBasic {
	  public static void main(String[] args) {
	        Car myCar = new Car();
	        myCar.run();
	    }
}
