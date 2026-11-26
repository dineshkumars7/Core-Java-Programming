package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q9_CollectionsComparison {
	public static void main(String[] args) {
        String[] inputs = {"Pass", "Fail", "Pass", "Skip", "Fail"};

        List<String> resultList = new ArrayList<>();
        Set<String> resultSet = new HashSet<>();

        for (String status : inputs) {
            resultList.add(status);
            resultSet.add(status);
        }

        System.out.println("List (Allows duplicates, keeps order) : " + resultList + " | Size: " + resultList.size());
        System.out.println("Set  (Unique only, no duplicates)     : " + resultSet + " | Size: " + resultSet.size());
    }
}
