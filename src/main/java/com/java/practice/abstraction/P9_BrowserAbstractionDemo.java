package com.java.practice.abstraction;

abstract class Browser {
    abstract void launch();
    abstract void close();
}

class Chrome extends Browser {
    @Override
    void launch() {
        System.out.println("Launching Chrome browser...");
    }

    @Override
    void close() {
        System.out.println("Closing Chrome browser.");
    }
}

class Firefox extends Browser {
    @Override
    void launch() {
        System.out.println("Launching Firefox browser...");
    }

    @Override
    void close() {
        System.out.println("Closing Firefox browser.");
    }
}
public class P9_BrowserAbstractionDemo {
	public static void main(String[] args) {
        Browser chrome = new Chrome();
        chrome.launch();
        chrome.close();

        Browser firefox = new Firefox();
        firefox.launch();
        firefox.close();
    }
}
