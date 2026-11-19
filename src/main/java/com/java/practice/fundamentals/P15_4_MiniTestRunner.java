package com.java.practice.fundamentals;

public class P15_4_MiniTestRunner {
	 public static void main(String[] args) {

	        System.out.println("==================================");
	        System.out.println("       MINI AUTOMATION RUNNER");
	        System.out.println("==================================");

	        // Creating objects
	        P15_1_LoginOperation login = new P15_1_LoginOperation();
	        P15_2_SearchOperation search = new P15_2_SearchOperation();
	        P15_3_LogoutOperation logout = new P15_3_LogoutOperation();

	        // Executing test operations
	        login.executeLogin();

	        search.executeSearch();

	        logout.executeLogout();

	        System.out.println("----------------------------------");
	        System.out.println("All test operations completed.");
	        System.out.println("==================================");
	    }
}
