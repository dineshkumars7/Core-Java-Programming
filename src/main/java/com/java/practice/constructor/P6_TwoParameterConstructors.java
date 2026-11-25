package com.java.practice.constructor;
//--> two parameter constructors
class Student {
    String name;
    double marks;

    // Constructor accepting name only
    Student(String studentName) {
        name = studentName;
        marks = 0.0;
    }

    // Constructor accepting name and marks
    Student(String studentName, double studentMarks) {
        name = studentName;
        marks = studentMarks;
    }

    void display() {
        System.out.println("Student: " + name + " | Marks: " + marks);
    }
}
public class P6_TwoParameterConstructors {
	 public static void main(String[] args) {
	        Student s1 = new Student("Kavya");
	        Student s2 = new Student("Nikhil", 89.5);

	        s1.display();
	        s2.display();
	    }
}
