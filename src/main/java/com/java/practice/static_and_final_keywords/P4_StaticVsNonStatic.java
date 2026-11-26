package com.java.practice.static_and_final_keywords;

public class P4_StaticVsNonStatic {

	 static int staticVar = 10;
	    int instanceVar = 20;

	    static void staticMethod() {
	        System.out.println("Inside staticMethod:");
	        System.out.println("Static Var: " + staticVar); // Allowed

	        // System.out.println(instanceVar); // COMPILE ERROR: Cannot access non-static directly

	        // Must create an object to access non-static members inside a static method
	        P4_StaticVsNonStatic obj = new P4_StaticVsNonStatic();
	        System.out.println("Instance Var (via object): " + obj.instanceVar);
	    }

	    void nonStaticMethod() {
	        System.out.println("\nInside nonStaticMethod:");
	        System.out.println("Static Var: " + staticVar);     // Allowed directly
	        System.out.println("Instance Var: " + instanceVar); // Allowed directly
	    }

	    public static void main(String[] args) {
	        staticMethod();

	        P4_StaticVsNonStatic demo = new P4_StaticVsNonStatic();
	        demo.nonStaticMethod();
	    }
}
