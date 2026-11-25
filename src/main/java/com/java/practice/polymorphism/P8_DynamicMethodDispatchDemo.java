package com.java.practice.polymorphism;

class Shape {
    void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle.");
    }
}
public class P8_DynamicMethodDispatchDemo {
	public static void main(String[] args) {
        Shape shapeRef;

        shapeRef = new Circle();
        shapeRef.draw();

        shapeRef = new Rectangle();
        shapeRef.draw();

        shapeRef = new Triangle();
        shapeRef.draw();
    }
}
