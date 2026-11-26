package com.java.practice.collections_framework;

import java.util.HashSet;
import java.util.Set;

public class Q3_Hashset {
	public static void main(String[] args) {
        Set<String> browsers = new HashSet<>();

        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Chrome");  // Duplicate ignored
        browsers.add("Firefox"); // Duplicate ignored

        System.out.println("HashSet Elements (Unique, Unordered): " + browsers);
        System.out.println("Total Unique Browsers: " + browsers.size());
    }
}
