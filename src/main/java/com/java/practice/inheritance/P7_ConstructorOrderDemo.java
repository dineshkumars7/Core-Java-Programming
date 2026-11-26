package com.java.practice.inheritance;

//Constructor inheritance

class BaseClass {
    BaseClass() {
        System.out.println("1. BaseClass constructor executed.");
    }
}

class DerivedClass extends BaseClass {
    DerivedClass() {
        // Implicit super() runs first
        System.out.println("2. DerivedClass constructor executed.");
    }
}

public class P7_ConstructorOrderDemo {
	public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
       
    }
}
