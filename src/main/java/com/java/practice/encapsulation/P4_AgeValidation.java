package com.java.practice.encapsulation;

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Validation Error: Age cannot be negative (" + age + ").");
        }
    }
}
public class P4_AgeValidation {
	 public static void main(String[] args) {
	        Person p = new Person();
	        p.setAge(-10); // Rejected
	        p.setAge(26);  // Accepted
	        System.out.println("Person's Age: " + p.getAge());
	    }
}
