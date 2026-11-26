package com.java.practice.access_modifiers;


class PublicEmployee {
    public String name = "Aarav";

    public void showRole() {
        System.out.println("Role: Senior QA Engineer");
    }
}

public class P1_PublicAccess {
	 public static void main(String[] args) {
	        PublicEmployee emp = new PublicEmployee();
	        System.out.println("Name: " + emp.name); // Accessible
	        emp.showRole();                          // Accessible
	    }
}
