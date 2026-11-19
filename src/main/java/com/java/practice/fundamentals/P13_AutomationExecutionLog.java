
package com.java.practice.fundamentals;

public class P13_AutomationExecutionLog {

    public static void main(String[] args) {

        String timestamp1 = "10:30:01";
        String timestamp2 = "10:30:03";
        String timestamp3 = "10:30:05";
        String timestamp4 = "10:30:08";
        String timestamp5 = "10:30:10";

        System.out.printf("[%s] %-10s : %s%n",
                timestamp1, "INFO", "Automation execution started");

        System.out.printf("[%s] %-10s : %s%n",
                timestamp2, "INFO", "Launching Chrome browser");

        System.out.printf("[%s] %-10s : %s%n",
                timestamp3, "INFO", "Navigating to OrangeHRM");

        System.out.printf("[%s] %-10s : %s%n",
                timestamp4, "PASS", "Login test executed successfully");

        System.out.printf("[%s] %-10s : %s%n",
                timestamp5, "INFO", "Automation execution completed");
    }
}
