package com.java.practice.abstraction;
abstract class SmartDevice {
    abstract void powerOn();
    abstract void connectWifi(String network);
    abstract void powerOff();
}

class SmartTV extends SmartDevice {
    @Override
    void powerOn() {
        System.out.println("SmartTV powered ON.");
    }

    @Override
    void connectWifi(String network) {
        System.out.println("SmartTV connected to Wi-Fi: " + network);
    }

    @Override
    void powerOff() {
        System.out.println("SmartTV powered OFF.");
    }
}

public class P7_MultipleAbstractMethodsDemo {
	public static void main(String[] args) {
        SmartDevice tv = new SmartTV();
        tv.powerOn();
        tv.connectWifi("Home_5G");
        tv.powerOff();
    }
}
