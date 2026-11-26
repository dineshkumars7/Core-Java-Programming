package com.java.practice.abstraction;



abstract class Appliance {
    Appliance() {
        System.out.println("1. Appliance (Abstract Parent) constructor executed.");
    }

    abstract void turnOn();
}

class WashingMachine extends Appliance {
    WashingMachine() {
        System.out.println("2. WashingMachine (Child) constructor executed.");
    }

    @Override
    void turnOn() {
        System.out.println("WashingMachine is now running.");
    }
}
public class P5_AbstractConstructorDemo {
	public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.turnOn();
    }
}
