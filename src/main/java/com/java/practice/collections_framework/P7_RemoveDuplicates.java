package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class P7_RemoveDuplicates {
	public static void main(String[] args) {
        List<String> rawTags = new ArrayList<>(Arrays.asList("@Smoke", "@Regression", "@Smoke", "@API", "@Regression"));
        System.out.println("Original List (with duplicates): " + rawTags);

        // Convert List to LinkedHashSet to remove duplicates & preserve order
        Set<String> uniqueTags = new LinkedHashSet<>(rawTags);
        System.out.println("Unique Values (Set)            : " + uniqueTags);
    }
}
