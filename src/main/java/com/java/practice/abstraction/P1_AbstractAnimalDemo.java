package com.java.practice.abstraction;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

public class P1_AbstractAnimalDemo {
	 public static void main(String[] args) {
	        Animal myDog = new Dog();
	        myDog.sound();
	    }
}
