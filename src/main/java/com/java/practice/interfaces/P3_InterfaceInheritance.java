package com.java.practice.interfaces;

interface Vehicle {
    void start();
}

interface ElectricVehicle extends Vehicle {
    void chargeBattery();
}

class TeslaModel3 implements ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Tesla Model 3 powered on silently.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging lithium-ion battery pack...");
    }
}

public class P3_InterfaceInheritance {
	 public static void main(String[] args) {
	        ElectricVehicle ev = new TeslaModel3();
	        ev.start();
	        ev.chargeBattery();
	    }
}
