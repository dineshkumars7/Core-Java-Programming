package com.java.practice.interfaces;

interface AppConstants {
    // Implicitly public, static, and final
    String APP_NAME = "AutomationSuite";
    int MAX_RETRIES = 3;
}

public class P8_InterfaceVariables  implements AppConstants {
	   public static void main(String[] args) {
	        // Accessible statically via interface name
	        System.out.println("App Name    : " + AppConstants.APP_NAME);
	        System.out.println("Max Retries : " + AppConstants.MAX_RETRIES);

	        // Attempting to modify causes a compiler error because variables are final:
	        // AppConstants.MAX_RETRIES = 5; // Error: cannot assign a value to final variable MAX_RETRIES
	    }
}
