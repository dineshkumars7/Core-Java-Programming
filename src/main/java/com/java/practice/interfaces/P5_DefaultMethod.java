package com.java.practice.interfaces;

interface GreetingService {
    void sayHello(String name);

    default void sayWelcome() {
        System.out.println("Welcome to the Java Interface Module!");
    }
}

class EnglishGreeting implements GreetingService {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}


public class P5_DefaultMethod {
	 public static void main(String[] args) {
	        GreetingService service = new EnglishGreeting();
	        service.sayHello("Aarav");
	        service.sayWelcome(); // Invoking default method
	    }
}
