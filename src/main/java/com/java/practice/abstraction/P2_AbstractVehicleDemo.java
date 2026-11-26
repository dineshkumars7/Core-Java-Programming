package com.java.practice.abstraction;

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle has stopped safely.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine started with key ignition.");
    }
}
public class P2_AbstractVehicleDemo {
	 public static void main(String[] args) {
	        Vehicle car = new Car();
	        car.start();
	        car.stop();
	    }
}
