package com.java.practice.constructor;
//constructor chaining using this()
class Product {
    int id;
    String name;
    double price;

    Product() {
        this(100, "Standard Item"); // Calls 2-arg constructor
    }

    Product(int id, String name) {
        this(id, name, 499.0); // Calls 3-arg constructor
    }

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Price: " + price);
    }
}

public class P8_ThisChaining {
	 public static void main(String[] args) {
	        Product p1 = new Product();
	        Product p2 = new Product(102, "USB Hub");
	        Product p3 = new Product(103, "Webcam", 2499.0);

	        p1.display();
	        p2.display();
	        p3.display();
	    }
}
