package com.java.practice.static_and_final_keywords;

class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Object created. Current count: " + count);
    }
}

public class P2_StaticShared {
	
	public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Modifying via one object reference reflects across all objects
        c1.count = 100;
        System.out.println("Value seen by c2: " + c2.count);
        System.out.println("Value seen by c3: " + c3.count);
    }
}
