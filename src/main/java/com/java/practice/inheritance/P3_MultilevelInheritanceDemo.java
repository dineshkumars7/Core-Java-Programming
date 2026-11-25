package com.java.practice.inheritance;
//Multilevel inheritance
class Grandparent {
    void grandparentMethod() {
        System.out.println("Method from Grandparent class.");
    }
}

class Parent extends Grandparent {
    void parentMethod() {
        System.out.println("Method from Parent class.");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Method from Child class.");
    }
}

public class P3_MultilevelInheritanceDemo {
	 public static void main(String[] args) {
	        Child child = new Child();
	        child.grandparentMethod();
	        child.parentMethod();
	        child.childMethod();
	    }
}
