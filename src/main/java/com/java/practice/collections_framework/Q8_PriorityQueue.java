package com.java.practice.collections_framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q8_PriorityQueue {
	 public static void main(String[] args) {
	        Queue<Integer> defectPriorities = new PriorityQueue<>();

	        defectPriorities.offer(40);
	        defectPriorities.offer(10);
	        defectPriorities.offer(30);
	        defectPriorities.offer(20);

	        System.out.println("Retrieving elements by priority (lowest number first):");
	        while (!defectPriorities.isEmpty()) {
	            System.out.println("Polled Priority: " + defectPriorities.poll());
	        }
	    }
}
