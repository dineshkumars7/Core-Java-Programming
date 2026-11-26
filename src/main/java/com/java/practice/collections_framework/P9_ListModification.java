package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class P9_ListModification {
	public static void main(String[] args) {
        List<String> users = new ArrayList<>();

        // 1. Add
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        System.out.println("After Add   : " + users);

        // 2. Retrieve
        String secondUser = users.get(1);
        System.out.println("Retrieved   : " + secondUser);

        // 3. Update (replace "Bob" at index 1 with "Bobby")
        users.set(1, "Bobby");
        System.out.println("After Update: " + users);

        // 4. Remove
        users.remove("Charlie");
        System.out.println("After Remove: " + users);
    }
}
