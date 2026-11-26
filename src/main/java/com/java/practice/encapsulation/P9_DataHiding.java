package com.java.practice.encapsulation;

class SecretVault {
    private String secretCode = "ALPHA-99";

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String newCode) {
        if (newCode != null && newCode.length() >= 4) {
            this.secretCode = newCode;
        }
    }
}


public class P9_DataHiding {
	  public static void main(String[] args) {
	        SecretVault vault = new SecretVault();

	        // Direct access causes a compiler error:
	        // System.out.println(vault.secretCode); // Error: secretCode has private access in SecretVault
	        // vault.secretCode = "123";             // Error: secretCode has private access in SecretVault

	        // Controlled access via public methods:
	        System.out.println("Current Code : " + vault.getSecretCode());
	        vault.setSecretCode("BETA-2026");
	        System.out.println("Updated Code : " + vault.getSecretCode());
	    }
}
