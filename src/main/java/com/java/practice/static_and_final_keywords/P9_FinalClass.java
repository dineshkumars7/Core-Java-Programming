package com.java.practice.static_and_final_keywords;

final class SecurityToken {
    void generate() {
        System.out.println("Generating encrypted token...");
    }
}

/*
// UNCOMMENTING THIS WILL CAUSE A COMPILE-TIME ERROR:
// "cannot inherit from final SecurityToken"
class CustomToken extends SecurityToken {
}
*/


public class P9_FinalClass {
	  public static void main(String[] args) {
	        SecurityToken token = new SecurityToken();
	        token.generate();
	    }
}
