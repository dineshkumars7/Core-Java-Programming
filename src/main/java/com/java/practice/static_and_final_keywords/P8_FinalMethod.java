package com.java.practice.static_and_final_keywords;

class Parent {
    final void showSecurityPolicy() {
        System.out.println("Parent: Strict Security Policy enforced.");
    }
}

class Child extends Parent {
    /*
    // UNCOMMENTING THIS WILL CAUSE A COMPILE-TIME ERROR:
    // "showSecurityPolicy() in Child cannot override showSecurityPolicy() in Parent; overridden method is final"
    @Override
    void showSecurityPolicy() {
        System.out.println("Child: Attempting to bypass policy.");
    }
    */
}

public class P8_FinalMethod {
	 public static void main(String[] args) {
	        Child child = new Child();
	        child.showSecurityPolicy(); // Inherited and usable, just not overridable
	    }
}
