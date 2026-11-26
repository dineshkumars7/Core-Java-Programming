package com.java.practice.collections_framework;

import java.util.LinkedList;
import java.util.Queue;

public class Q7_Queue {
	 public static void main(String[] args) {
	        Queue<String> jobQueue = new LinkedList<>();

	        // Adding elements to the queue
	        jobQueue.offer("Build_#101");
	        jobQueue.offer("Build_#102");
	        jobQueue.offer("Build_#103");

	        System.out.println("Queue Contents : " + jobQueue);
	        System.out.println("Next in Line (peek): " + jobQueue.peek());
	        System.out.println("Processing (poll)  : " + jobQueue.poll());
	        System.out.println("Remaining Queue    : " + jobQueue);
	    }
}
