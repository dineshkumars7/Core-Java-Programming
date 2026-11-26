package com.java.practice.encapsulation;

class Citizen {
    private final String aadhaarId;
    private final String fullName;

    // Values initialized once via constructor; no setters provided
    public Citizen(String aadhaarId, String fullName) {
        this.aadhaarId = aadhaarId;
        this.fullName = fullName;
    }

    public String getAadhaarId() {
        return aadhaarId;
    }

    public String getFullName() {
        return fullName;
    }
}


public class P6_ReadOnlyProperty {
	 public static void main(String[] args) {
	        Citizen citizen = new Citizen("1234-5678-9012", "Priya Nair");
	        System.out.println("ID   : " + citizen.getAadhaarId());
	        System.out.println("Name : " + citizen.getFullName());
	    }
}
