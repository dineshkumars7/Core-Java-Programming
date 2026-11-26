package com.java.practice.access_modifiers;


class ParentClass {
    public String pubMsg = "Public Data";
    protected String protMsg = "Protected Data";
    String defMsg = "Default Data";
    private String privMsg = "Private Data";
}

class ChildClass extends ParentClass {
    void checkInheritedMembers() {
        System.out.println(pubMsg);   // Inherited & Accessible
        System.out.println(protMsg);  // Inherited & Accessible
        System.out.println(defMsg);   // Inherited & Accessible (same package)
        // System.out.println(privMsg); // COMPILE ERROR: Private members are NOT inherited
    }
}


public class P9_InheritanceAccess {
	public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.checkInheritedMembers();
    }
}
