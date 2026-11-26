package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q10_QATestDataManagement {
	public static void main(String[] args) {
        // 1. Map for Username & Password credentials
        Map<String, String> credentials = new HashMap<>();
        credentials.put("admin_user", "Admin@2026");
        credentials.put("guest_user", "Guest@123");

        // 2. List for Ordered Test Cases
        List<String> testSuite = new ArrayList<>();
        testSuite.add("TC01_AdminLogin");
        testSuite.add("TC02_GuestLogin");
        testSuite.add("TC03_ProfileUpdate");

        // 3. Set for Unique Execution Outcomes
        Set<String> uniqueStatuses = new HashSet<>();

        System.out.println("--- Executing QA Test Suite ---");
        for (String testCase : testSuite) {
            if (testCase.contains("Admin")) {
                System.out.println("Running " + testCase + " with password: " + credentials.get("admin_user") + " -> PASS");
                uniqueStatuses.add("PASS");
            } else if (testCase.contains("Guest")) {
                System.out.println("Running " + testCase + " with password: " + credentials.get("guest_user") + " -> PASS");
                uniqueStatuses.add("PASS");
            } else {
                System.out.println("Running " + testCase + " -> FAIL");
                uniqueStatuses.add("FAIL");
            }
        }

        System.out.println("\nTotal Tests Executed : " + testSuite.size());
        System.out.println("Unique Result Types  : " + uniqueStatuses);
    }
}
