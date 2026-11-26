package com.java.practice.abstraction;

abstract class BaseTest {
    void setup() {
        System.out.println("[Setup] Initializing WebDriver and opening application URL.");
    }

    abstract void executeTest();

    void teardown() {
        System.out.println("[Teardown] Quitting WebDriver session.\n");
    }

    // Template method enforcing test lifecycle
    public final void runTest() {
        setup();
        executeTest();
        teardown();
    }
}

class LoginTest extends BaseTest {
    @Override
    void executeTest() {
        System.out.println("[LoginTest] Entering valid credentials and verifying dashboard access.");
    }
}

class SearchTest extends BaseTest {
    @Override
    void executeTest() {
        System.out.println("[SearchTest] Searching for 'Wireless Headphones' and verifying results.");
    }
}

public class P10_AutomationBaseClassDemo {
	 public static void main(String[] args) {
	        BaseTest loginTest = new LoginTest();
	        loginTest.runTest();

	        BaseTest searchTest = new SearchTest();
	        searchTest.runTest();
	    }
}
