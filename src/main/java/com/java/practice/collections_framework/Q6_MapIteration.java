package com.java.practice.collections_framework;

import java.util.HashMap;
import java.util.Map;

public class Q6_MapIteration {
    public static void main(String[] args) {
        Map<String, String> envUrls = new HashMap<>();
        envUrls.put("DEV", "https://example.com");
        envUrls.put("QA", "https://example.com");
        envUrls.put("PROD", "https://example.com");

        // 1. Using entrySet() (Keys + Values)
        System.out.println("--- Using entrySet() ---");
        for (Map.Entry<String, String> entry : envUrls.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 2. Using keySet() (Keys only)
        System.out.println("\n--- Using keySet() ---");
        for (String key : envUrls.keySet()) {
            System.out.println("Environment Key: " + key);
        }

        // 3. Using values() (Values only)
        System.out.println("\n--- Using values() ---");
        for (String url : envUrls.values()) {
            System.out.println("Environment URL: " + url);
        }
    }

}
