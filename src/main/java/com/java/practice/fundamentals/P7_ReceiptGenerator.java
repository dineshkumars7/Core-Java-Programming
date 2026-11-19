package com.java.practice.fundamentals;

public class P7_ReceiptGenerator {
	public static void main(String[] args) {
        String item1 = "Wireless Mouse";
        int qty1 = 2;
        double price1 = 799.50;

        String item2 = "Mechanical Keyboard";
        int qty2 = 1;
        double price2 = 3499.00;

        String item3 = "USB-C Cable";
        int qty3 = 3;
        double price3 = 299.00;

        double total = (qty1 * price1) + (qty2 * price2) + (qty3 * price3);

        System.out.println("---------------------------------------------");
        System.out.println("               TECH MART RECEIPT             ");
        System.out.println("---------------------------------------------");
        System.out.printf("%-22s %5s %14s%n", "Product Name", "Qty", "Price (INR)");
        System.out.println("---------------------------------------------");
        System.out.printf("%-22s %5d %14.2f%n", item1, qty1, qty1 * price1);
        System.out.printf("%-22s %5d %14.2f%n", item2, qty2, qty2 * price2);
        System.out.printf("%-22s %5d %14.2f%n", item3, qty3, qty3 * price3);
        System.out.println("---------------------------------------------");
        System.out.printf("%-28s %14.2f%n", "GRAND TOTAL:", total);
        System.out.println("---------------------------------------------");
    }
}
