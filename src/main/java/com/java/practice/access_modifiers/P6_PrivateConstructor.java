package com.java.practice.access_modifiers;

class DatabaseConnection {
    private static DatabaseConnection instance;

    // Private constructor prevents direct instantiation
    private DatabaseConnection() {
        System.out.println("Database Connected!");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

public class P6_PrivateConstructor {
	public static void main(String[] args) {
        // COMPILE ERROR: DatabaseConnection() has private access
        // DatabaseConnection db = new DatabaseConnection();

        // Valid way to obtain object
        DatabaseConnection db = DatabaseConnection.getInstance();
    }
}
