package com.java.practice.constructor;
//--> Constructor based object initialization
class TestConfiguration {
    String browserName;
    String url;
    int timeoutSeconds;

    // Default configuration
    TestConfiguration() {
        this("Chrome", "https://example.com", 30);
    }

    // Custom configuration
    TestConfiguration(String browserName, String url, int timeoutSeconds) {
        this.browserName = browserName;
        this.url = url;
        this.timeoutSeconds = timeoutSeconds;
    }

    void printConfig() {
        System.out.println("Browser : " + browserName);
        System.out.println("URL     : " + url);
        System.out.println("Timeout : " + timeoutSeconds + "s");
        System.out.println("---------------------------");
    }
}
public class P10_TestConfigDemo {
	  public static void main(String[] args) {
	        TestConfiguration defaultConfig = new TestConfiguration();
	        TestConfiguration stagingConfig = new TestConfiguration("Firefox", "https://example.com", 60);

	        defaultConfig.printConfig();
	        stagingConfig.printConfig();
	    }
}
