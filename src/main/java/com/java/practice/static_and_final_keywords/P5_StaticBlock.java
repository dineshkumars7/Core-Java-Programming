package com.java.practice.static_and_final_keywords;

public class P5_StaticBlock {
	static {
        System.out.println("1. Static block executed first (Class Loading).");
    }

    public static void main(String[] args) {
        System.out.println("2. Main method executed second.");
    }
}
