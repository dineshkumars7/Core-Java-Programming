package com.java.practice.inheritance;
//QA Framwork inheritance

class BaseTest {
    void setup() {
        System.out.println("Launching browser and navigating to application URL...");
    }

    void tearDown() {
        System.out.println("Closing browser session.\n");
    }
}

class LoginTest extends BaseTest {
    void testValidLogin() {
        setup();
        System.out.println("Executing LoginTest: Entering valid username and password.");
        System.out.println("Assertion Passed: User logged in successfully.");
        tearDown();
    }
}

class SearchTest extends BaseTest {
    void testProductSearch() {
        setup();
        System.out.println("Executing SearchTest: Searching for 'Laptop'.");
        System.out.println("Assertion Passed: Relevant search results displayed.");
        tearDown();
    }
}

public class P10_QAFrameworkDemo {
	 public static void main(String[] args) {
	        LoginTest loginTest = new LoginTest();
	        loginTest.testValidLogin();

	        SearchTest searchTest = new SearchTest();
	        searchTest.testProductSearch();
	    }
}
