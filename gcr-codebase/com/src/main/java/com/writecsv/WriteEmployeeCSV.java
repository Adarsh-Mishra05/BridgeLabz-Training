package com.writecsv;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {
    public static void main(String[] args) {

        // ✅ CSV file name (will be created in your project folder)
        String fileName = "/Users/apple/Desktop/java programming workspace/gcr-codebase/com/src/main/resources/employees.csv";

        try (FileWriter writer = new FileWriter(fileName)) {

            // ✅ Write header
            writer.append("ID,Name,Department,Salary\n");

            // ✅ Write 5 employee records
            writer.append("201,Adarsh Mishra,Software,65000\n");
            writer.append("202,Rahul Sharma,HR,42000\n");
            writer.append("203,Priya Singh,Finance,55000\n");
            writer.append("204,Aman Verma,Marketing,48000\n");
            writer.append("205,Neha Gupta,IT Support,50000\n");

            System.out.println("✅ CSV File created successfully: " + fileName);

        } catch (IOException e) {
            System.out.println("❌ Error while writing CSV file: " + e.getMessage());
        }
    }
}
