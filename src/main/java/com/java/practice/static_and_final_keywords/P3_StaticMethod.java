package com.java.practice.static_and_final_keywords;

class MathHelper {
    static int square(int number) {
        return number * number;
    }
}

public class P3_StaticMethod {
	 static void greet() {
	        System.out.println("Hello from static method in main class!");
	    }

	    public static void main(String[] args) {
	        // Calling static method within the same class
	        greet();

	        // Calling static method from another class
	        int result = MathHelper.square(6);
	        System.out.println("Square of 6: " + result);
	    }
}
