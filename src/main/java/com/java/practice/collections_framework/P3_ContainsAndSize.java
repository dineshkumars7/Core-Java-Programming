package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class P3_ContainsAndSize {
	   public static void main(String[] args) {
	        List<String> environments = new ArrayList<>();
	        environments.add("DEV");
	        environments.add("QA");
	        environments.add("STAGING");
	        environments.add("PROD");

	        System.out.println("Total Environments: " + environments.size());
	        System.out.println("Contains 'QA'?    : " + environments.contains("QA"));
	        System.out.println("Contains 'UAT'?   : " + environments.contains("UAT"));
	    }
}
