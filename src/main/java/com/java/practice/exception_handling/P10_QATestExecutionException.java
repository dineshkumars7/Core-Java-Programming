package com.java.practice.exception_handling;
//Demonstrates a realistic automation framework scenario where invalid test configuration throws a custom InvalidTestConfigException caught by the test runner
//Custom Framework Configuration Exception
class InvalidTestConfigException extends Exception {
 public InvalidTestConfigException(String message) {
     super(message);
 }
}

class TestExecutor {
 public void startExecution(String browser, String envUrl) throws InvalidTestConfigException {
     if (browser == null || (!browser.equalsIgnoreCase("Chrome") && !browser.equalsIgnoreCase("Firefox"))) {
         throw new InvalidTestConfigException("Unsupported browser configured: '" + browser + "'. Use Chrome or Firefox.");
     }
     if (envUrl == null || !envUrl.startsWith("http")) {
         throw new InvalidTestConfigException("Invalid Environment URL configured: '" + envUrl + "'.");
     }
     System.out.println("Launching " + browser + " against " + envUrl + "...");
 }
}

public class P10_QATestExecutionException {
	 public static void main(String[] args) {
	        TestExecutor executor = new TestExecutor();

	        try {
	            System.out.println("[Runner] Validating test configuration...");
	            executor.startExecution("Safari", "https://example.com");
	        } catch (InvalidTestConfigException e) {
	            System.err.println("[Runner Abort] Test Suite Stopped: " + e.getMessage());
	        } finally {
	            System.out.println("[Runner] Generating execution summary report.");
	        }
	    }
}
