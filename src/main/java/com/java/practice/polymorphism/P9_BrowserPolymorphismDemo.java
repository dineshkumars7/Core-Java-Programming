package com.java.practice.polymorphism;

class Browser {
    void launch() {
        System.out.println("Launching default web browser...");
    }
}

class Chrome extends Browser {
    @Override
    void launch() {
        System.out.println("Launching Google Chrome browser...");
    }
}

class Firefox extends Browser {
    @Override
    void launch() {
        System.out.println("Launching Mozilla Firefox browser...");
    }
}

class Edge extends Browser {
    @Override
    void launch() {
        System.out.println("Launching Microsoft Edge browser...");
    }
}

public class P9_BrowserPolymorphismDemo {
	 public static void main(String[] args) {
	        Browser[] browsers = { new Chrome(), new Firefox(), new Edge() };

	        for (Browser b : browsers) {
	            b.launch();
	        }
	    }
}
