package com.java.practice.interfaces;

interface Logger {
    default void log(String message) {
        System.out.println("[DEFAULT LOG]: " + message);
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[FILE LOG]: Writing '" + message + "' to app.log");
    }
}


public class P6_DefaultMethodOverride {
	 public static void main(String[] args) {
	        Logger logger = new FileLogger();
	        logger.log("Application started successfully.");
	    }
}
