package com.java.practice.fundamentals;

public class P3_MultiplePrintStatements {
	public static void main(String[] args) {
        String sentence = "Java is a versatile programming language.";

        // Using print() - does not move to a new line automatically
        System.out.print(sentence + "\n");

        // Using println() - automatically moves to a new line
        System.out.println(sentence);

        

//Why Use printf?
//
//Unlike System.out.println(), printf lets you control how values are displayed. You can:
//• Insert variables cleanly into templates (such as %s for strings, %d for integers, and %f for floating-point numbers).
//• Control decimal places (for example, %.2f for two decimal places).
//• Align text and pad numbers with spaces or leading zeros (for example, %05d or %-10s)
        
        // Using printf() - used for formatted output
        System.out.printf("%s\n", sentence);
        
        
        String item = "Coffee";
        int quantity = 2;
        double price = 149.5;

        System.out.printf("Item: %s | Qty: %d | Total: Rs. %.2f\n", item, quantity, price);
    }
}
