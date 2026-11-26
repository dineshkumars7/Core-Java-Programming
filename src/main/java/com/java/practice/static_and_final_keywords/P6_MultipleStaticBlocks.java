package com.java.practice.static_and_final_keywords;

public class P6_MultipleStaticBlocks {
	   static {
	        System.out.println("1. First static block executed.");
	    }

	    static {
	        System.out.println("2. Second static block executed.");
	    }

	    public static void main(String[] args) {
	        System.out.println("4. Main method executed.");
	    }

	    static {
	        System.out.println("3. Third static block executed (even though placed below main).");
	    }
}
