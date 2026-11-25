package com.java.practice.polymorphism;
class BaseTest {
    void executeTest() {
        System.out.println("Running generic test steps...");
    }
}

class LoginTest extends BaseTest {
    @Override
    void executeTest() {
        System.out.println("[LoginTest] Navigating to login page -> Submitting valid credentials -> Verifying dashboard.");
    }
}

class CheckoutTest extends BaseTest {
    @Override
    void executeTest() {
        System.out.println("[CheckoutTest] Adding item to cart -> Entering shipping details -> Confirming order.");
    }
}

class ProfileTest extends BaseTest {
    @Override
    void executeTest() {
        System.out.println("[ProfileTest] Opening settings -> Updating email address -> Saving changes.");
    }
}
public class P10_AutomationTestSuite {
	 public static void main(String[] args) {
	        // Common parent reference executing different test classes
	        BaseTest testRunner;

	        testRunner = new LoginTest();
	        testRunner.executeTest();

	        testRunner = new CheckoutTest();
	        testRunner.executeTest();

	        testRunner = new ProfileTest();
	        testRunner.executeTest();
	    }
}
