package com.java.practice.inheritance;

//Multilevel inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving on the road.");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("ElectricCar battery is charging.");
    }
}

public class P4_VehicleMultilevelDemo {
	  public static void main(String[] args) {
	        ElectricCar ev = new ElectricCar();
	        ev.start();
	        ev.drive();
	        ev.chargeBattery();
	    }
}
