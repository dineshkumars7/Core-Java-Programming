package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P8_CollectionComparison {
	  public static void main(String[] args) {
	        List<String> sprint1Tests = new ArrayList<>(Arrays.asList("TC_01", "TC_02", "TC_03", "TC_04"));
	        List<String> smokeSuite   = new ArrayList<>(Arrays.asList("TC_02", "TC_04", "TC_05", "TC_06"));

	        // Create a copy so original list stays intact
	        List<String> commonTests = new ArrayList<>(sprint1Tests);
	        commonTests.retainAll(smokeSuite);

	        System.out.println("Sprint 1 Tests : " + sprint1Tests);
	        System.out.println("Smoke Suite    : " + smokeSuite);
	        System.out.println("Common Elements: " + commonTests);
	    }
}
