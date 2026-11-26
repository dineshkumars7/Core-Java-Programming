package com.java.practice.access_modifiers;


class AllModifiers {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;
    private int privateVar = 4;
}

public class P7_ModifierComparison {
	public static void main(String[] args) {
        AllModifiers obj = new AllModifiers();

        System.out.println("Public    : " + obj.publicVar);    // Accessible
        System.out.println("Protected : " + obj.protectedVar); // Accessible
        System.out.println("Default   : " + obj.defaultVar);   // Accessible
        // System.out.println("Private: " + obj.privateVar);   // COMPILE ERROR
    }
}
