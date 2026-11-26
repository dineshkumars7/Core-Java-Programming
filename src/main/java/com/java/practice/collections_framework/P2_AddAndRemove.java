package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2_AddAndRemove {
	 public static void main(String[] args) {
	        List<String> tools = new ArrayList<>();

	        // Adding multiple elements
	        tools.addAll(Arrays.asList("Selenium", "Playwright", "Cypress", "Appium", "JMeter"));
	        System.out.println("Initial Tools : " + tools);

	        // Removing selected elements
	        tools.remove("Cypress"); // Remove by object value
	        tools.remove(0);         // Remove by index ("Selenium")

	        System.out.println("Remaining Tools: " + tools);
	    }
}
