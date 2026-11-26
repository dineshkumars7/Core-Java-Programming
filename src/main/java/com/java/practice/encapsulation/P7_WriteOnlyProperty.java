package com.java.practice.encapsulation;

class ApiKeyStore {
    private String apiKey;

    // Setter only; raw key cannot be read back directly
    public void setApiKey(String apiKey) {
        if (apiKey != null && !apiKey.trim().isEmpty()) {
            this.apiKey = apiKey;
            System.out.println("API Key securely stored.");
        } else {
            System.out.println("Invalid API Key.");
        }
    }

    public void connectService() {
        if (apiKey != null) {
            System.out.println("Connecting to external service using stored API Key...");
        } else {
            System.out.println("Connection failed: API Key not configured.");
        }
    }
}

public class P7_WriteOnlyProperty {
	   public static void main(String[] args) {
	        ApiKeyStore store = new ApiKeyStore();
	        store.connectService();
	        store.setApiKey("sk_live_987654321");
	        store.connectService();
	    }
}
