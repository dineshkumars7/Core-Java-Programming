package com.java.practice.access_modifiers;

class DefaultConfig {
    String browser = "Chrome"; // default access

    void launch() {            // default access
        System.out.println("Launching " + browser + " browser...");
    }
}

public class P3_DefaultAccess {
	  public static void main(String[] args) {
	        DefaultConfig config = new DefaultConfig();
	        System.out.println("Browser: " + config.browser); // Accessible in same package
	        config.launch();                                  // Accessible in same package
	    }
}
