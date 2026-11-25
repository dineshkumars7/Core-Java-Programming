package com.java.practice.oops_concepts;

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started with ignition button.");
    }
}

public class P3_AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();
    }
}