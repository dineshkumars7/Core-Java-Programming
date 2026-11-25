package com.java.practice.inheritance;

//Hierarchical inheritance
class Shape {
    void displayShape() {
        System.out.println("This is a geometric shape.");
    }
}

class Circle extends Shape {
    void area(double r) {
        System.out.println("Circle Area: " + (Math.PI * r * r));
    }
}

class Rectangle extends Shape {
    void area(double l, double w) {
        System.out.println("Rectangle Area: " + (l * w));
    }
}

class Triangle extends Shape {
    void area(double b, double h) {
        System.out.println("Triangle Area: " + (0.5 * b * h));
    }
}

public class P5_ShapeHierarchyDemo {
	 public static void main(String[] args) {
	        Circle c = new Circle();
	        c.displayShape();
	        c.area(5.0);

	        Rectangle r = new Rectangle();
	        r.displayShape();
	        r.area(4.0, 6.0);

	        Triangle t = new Triangle();
	        t.displayShape();
	        t.area(3.0, 8.0);
	    }
}
