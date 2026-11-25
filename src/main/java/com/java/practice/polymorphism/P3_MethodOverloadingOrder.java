package com.java.practice.polymorphism;
//---> Method overloading order
class Registration {
    void register(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void register(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}
public class P3_MethodOverloadingOrder {
	 public static void main(String[] args) {
	        Registration reg = new Registration();
	        reg.register("Aarav", 25);
	        reg.register(30, "Diya");
	    }
}
