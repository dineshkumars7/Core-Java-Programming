package com.java.practice.inheritance;
//Sinlge inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class P1_SingleInheritanceDemo {
	 public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.eat();  // Parent class method
	        dog.bark(); // Child class method
	    }
}
