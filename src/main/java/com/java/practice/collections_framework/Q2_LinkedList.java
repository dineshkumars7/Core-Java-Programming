package com.java.practice.collections_framework;

import java.util.LinkedList;

public class Q2_LinkedList {
	 public static void main(String[] args) {
	        LinkedList<String> tasks = new LinkedList<>();

	        tasks.add("Write Test Plan");
	        tasks.add("Execute Smoke Suite");
	        System.out.println("Initial Tasks    : " + tasks);

	        // Insert at first, last, and specific index
	        tasks.addFirst("Setup Test Environment");
	        tasks.addLast("Publish Execution Report");
	        tasks.add(2, "Review Test Data");
	        System.out.println("After Insertions : " + tasks);

	        // Delete from first, last, and specific index
	        tasks.removeFirst();
	        tasks.removeLast();
	        tasks.remove(1);
	        System.out.println("After Deletions  : " + tasks);
	    }
}
