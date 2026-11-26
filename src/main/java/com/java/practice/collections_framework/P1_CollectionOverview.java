package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class P1_CollectionOverview {
	 public static void main(String[] args) {
	        List<String> browsers = new ArrayList<>();

	        // Adding elements
	        browsers.add("Chrome");
	        browsers.add("Firefox");
	        browsers.add("Edge");
	        browsers.add("Safari");

	        // Retrieving a specific element
	        System.out.println("First Browser: " + browsers.get(0));

	        // Displaying all elements
	        System.out.println("All Browsers : " + browsers);
	    }
}
