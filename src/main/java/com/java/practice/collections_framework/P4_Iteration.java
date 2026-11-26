package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P4_Iteration {
	public static void main(String[] args) {
        List<String> modules = new ArrayList<>(Arrays.asList("Login", "Dashboard", "Checkout", "Reports"));

        // 1. Standard for loop
        System.out.println("--- Standard For Loop ---");
        for (int i = 0; i < modules.size(); i++) {
            System.out.println(modules.get(i));
        }

        // 2. Enhanced for-each loop
        System.out.println("\n--- Enhanced For Loop ---");
        for (String module : modules) {
            System.out.println(module);
        }

        // 3. Iterator
        System.out.println("\n--- Iterator ---");
        Iterator<String> iterator = modules.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
