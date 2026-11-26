package com.java.practice.static_and_final_keywords;

class Company {
    static String companyName = "TechCorp Solutions";
}

public class P1_StaticVariable {
	public static void main(String[] args) {
        // Accessing static variable directly via ClassName
        System.out.println("Company Name: " + Company.companyName);
    }
}
