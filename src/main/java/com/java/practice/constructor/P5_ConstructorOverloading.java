package com.java.practice.constructor;
//--> constructor overloading
class Box {
    double width, height, depth;

    // 1. No-arg constructor
    Box() {
        width = height = depth = 1.0;
    }

    // 2. Single-parameter constructor (cube)
    Box(double side) {
        width = height = depth = side;
    }

    // 3. Three-parameter constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class P5_ConstructorOverloading {
	public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5.0);
        Box b3 = new Box(2.0, 3.0, 4.0);

        System.out.println("Default Box Volume : " + b1.volume());
        System.out.println("Cube Box Volume    : " + b2.volume());
        System.out.println("Custom Box Volume  : " + b3.volume());
    }
}
