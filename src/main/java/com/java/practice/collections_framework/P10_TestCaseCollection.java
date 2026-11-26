package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P10_TestCaseCollection {
	public static void main(String[] args) {
        List<String> testQueue = new ArrayList<>(Arrays.asList(
            "TC_03_PaymentGateway",
            "TC_01_UserLogin",
            "TC_04_OrderHistory",
            "TC_02_AddToCart"
        ));

        System.out.println("Initial Test Queue : " + testQueue);

        // Sort test cases alphabetically by ID
        Collections.sort(testQueue);
        System.out.println("Sorted Test Queue  : " + testQueue);

        // Remove completed test cases
        List<String> completedTests = Arrays.asList("TC_01_UserLogin", "TC_02_AddToCart");
        testQueue.removeAll(completedTests);

        System.out.println("Pending Test Cases : " + testQueue);
    }
}
