package com.java.practice.exception_handling;

//Demonstrates declaring a checked exception (IOException) in a method signature using throws and handling it in the caller.
import java.io.FileReader;
import java.io.IOException;

public class P7_ThrowsKeywordCheckedException {
	 // Declares checked exception using 'throws'
    static void readTestDataFile(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        System.out.println("File opened successfully.");
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readTestDataFile("non_existent_testdata.csv");
        } catch (IOException e) {
            System.out.println("Caller handled checked IOException: " + e.getMessage());
        }
    }
}
