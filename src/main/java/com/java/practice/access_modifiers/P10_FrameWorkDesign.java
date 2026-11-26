package com.java.practice.access_modifiers;

class BaseTest {
    // 1. Private: Sensitive test credentials hidden from subclasses & external classes
    private String apiKey = "SECRET_TOKEN_98765";

    // 2. Protected: Reusable helper actions available to test subclasses
    protected void loginWithApiKey() {
        System.out.println("[Protected] Authenticating using key: " + apiKey);
    }

    // 3. Default: Package-level utility for internal framework logging
    void logStep(String message) {
        System.out.println("[Default Log] " + message);
    }

    // 4. Public: Entry point accessible by any test runner
    public void executeTest() {
        logStep("Starting test execution...");
        loginWithApiKey();
        logStep("Test completed successfully.");
    }
}


public class P10_FrameWorkDesign extends BaseTest {
    public static void main(String[] args) {
        P10_FrameWorkDesign test = new P10_FrameWorkDesign();
        test.executeTest(); // Invokes public workflow combining all access levels
    }
}