package com.java.practice.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P5_Sorting {
	public static void main(String[] args) {
        List<Integer> responseTimes = new ArrayList<>(Arrays.asList(420, 115, 890, 230, 55));

        System.out.println("Original Order  : " + responseTimes);

        // Ascending order
        Collections.sort(responseTimes);
        System.out.println("Ascending Order : " + responseTimes);

        // Descending order
        Collections.sort(responseTimes, Collections.reverseOrder());
        System.out.println("Descending Order: " + responseTimes);
    }
}
