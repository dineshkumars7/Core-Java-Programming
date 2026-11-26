package com.java.practice.static_and_final_keywords;

class ConfigConstants {
    public static final String APP_URL = "https://example.com";
    public static final int EXPLICIT_TIMEOUT = 15;
    public static final String ENVIRONMENT = "QA-STAGING";
}

public class P10_AutomationConfig {
	 public static void main(String[] args) {
	        System.out.println("--- Starting Automation Suite ---");
	        System.out.println("Environment : " + ConfigConstants.ENVIRONMENT);
	        System.out.println("Navigating  : " + ConfigConstants.APP_URL);
	        System.out.println("Wait Timeout: " + ConfigConstants.EXPLICIT_TIMEOUT + " seconds");
	    }
}
