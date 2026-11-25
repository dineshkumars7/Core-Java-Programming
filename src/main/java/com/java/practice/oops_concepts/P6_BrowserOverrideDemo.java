package com.java.practice.oops_concepts;

class Browser {
    void launch() {
        System.out.println("Launching generic browser...");
    }
}

class ChromeBrowser extends Browser {
    @Override
    void launch() {
        System.out.println("Launching Google Chrome with custom profile...");
    }
}

public class P6_BrowserOverrideDemo {
	  public static void main(String[] args) {
	        ChromeBrowser chrome = new ChromeBrowser();
	        chrome.launch();
	    }
}
