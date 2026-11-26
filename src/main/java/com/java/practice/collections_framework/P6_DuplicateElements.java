package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class P6_DuplicateElements {
	public static void main(String[] args) {
        List<String> statusCodes = new ArrayList<>();
        statusCodes.add("200 OK");
        statusCodes.add("404 Not Found");
        statusCodes.add("200 OK");
        statusCodes.add("500 Server Error");
        statusCodes.add("200 OK");

        System.out.println("List with Duplicates: " + statusCodes);
        System.out.println("Total Entries Count : " + statusCodes.size());
    }
}
