package com.java.practice.encapsulation;


class Student {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("Marks updated to: " + this.marks);
        } else {
            System.out.println("Invalid marks (" + marks + "). Must be between 0 and 100.");
        }
    }
}
public class P2_StudentEncapsulation {
	  public static void main(String[] args) {
	        Student student = new Student();
	        student.setMarks(110); // Rejected
	        student.setMarks(-5);  // Rejected
	        student.setMarks(88);  // Accepted
	        System.out.println("Stored Marks: " + student.getMarks());
	    }
}
