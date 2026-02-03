package com.csvread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReadStudent {
    public static void main(String[] args) {

        // ✅ Change this path according to your CSV file location
        String filePath = "/Users/apple/Desktop/java programming workspace/gcr-codebase/com/src/main/resources/Students.csv";

        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // ✅ Read Header (first line)
            String header = br.readLine();

            System.out.println("====== STUDENT DETAILS ======");
            System.out.println("Header: " + header);
            System.out.println("-----------------------------");

            // ✅ Read all student records
            while ((line = br.readLine()) != null) {

                // split line by comma
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                double marks = Double.parseDouble(data[3]);

                // ✅ Print in structured format
                System.out.println("Student ID   : " + id);
                System.out.println("Student Name : " + name);
                System.out.println("Student Age  : " + age);
                System.out.println("Student Marks: " + marks);
                System.out.println("-----------------------------");
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
