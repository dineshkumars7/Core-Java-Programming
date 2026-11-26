package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class Q1_ArrayList {
	 public static void main(String[] args) {
	        List<String> testCases = new ArrayList<>();

	        // 1. Add
	        testCases.add("TC01_Login");
	        testCases.add("TC02_SearchProduct");
	        testCases.add("TC03_Checkout");
	        System.out.println("Initial List : " + testCases);

	        // 2. Retrieve
	        System.out.println("Second Test  : " + testCases.get(1));

	        // 3. Update
	        testCases.set(1, "TC02_AdvancedSearch");
	        System.out.println("Updated List : " + testCases);

	        // 4. Remove
	        testCases.remove("TC03_Checkout");
	        System.out.println("Final List   : " + testCases);
	    }
}
