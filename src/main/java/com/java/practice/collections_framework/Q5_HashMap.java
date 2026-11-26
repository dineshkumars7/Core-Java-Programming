package com.java.practice.collections_framework;

import java.util.HashMap;
import java.util.Map;

public class Q5_HashMap {
	 public static void main(String[] args) {
	        Map<Integer, String> employees = new HashMap<>();

	        employees.put(101, "Ananya Sharma");
	        employees.put(102, "Rohan Verma");
	        employees.put(103, "Karthik Nair");

	        System.out.println("All Employees   : " + employees);
	        System.out.println("Employee ID 102 : " + employees.get(102));
	        System.out.println("Employee ID 999 : " + employees.getOrDefault(999, "Not Found"));
	    }
}
