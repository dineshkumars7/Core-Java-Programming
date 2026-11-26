package com.java.practice.interfaces;

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}


public class P1_BasicInterface {
	 public static void main(String[] args) {
	        Animal myDog = new Dog();
	        myDog.sound();
	    }
}
