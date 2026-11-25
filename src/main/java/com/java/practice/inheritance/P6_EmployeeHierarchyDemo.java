package com.java.practice.inheritance;
//Hierarchical inheritance
class Employeee {
    String company = "TechCorp";

    void work() {
        System.out.println("Working at " + company);
    }
}

class Developer extends Employeee {
    void writeCode() {
        System.out.println("Developer is writing Java code.");
    }
}

class Tester extends Employeee {
    void runTests() {
        System.out.println("Tester is executing automated tests.");
    }
}

class Managerr extends Employeee {
    void manageTeam() {
        System.out.println("Manager is planning the sprint.");
    }
}

public class P6_EmployeeHierarchyDemo {
	public static void main(String[] args) {
        Developer dev = new Developer();
        dev.work();
        dev.writeCode();

        Tester qa = new Tester();
        qa.work();
        qa.runTests();

        Managerr mgr = new Managerr();
        mgr.work();
        mgr.manageTeam();
    }
}
