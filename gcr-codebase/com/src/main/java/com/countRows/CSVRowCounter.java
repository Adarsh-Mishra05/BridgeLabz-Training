package com.countRows;

import com.opencsv.CSVReader;
import java.io.FileReader;

public class CSVRowCounter {
    public static void main(String[] args) {

        String filePath = "/Users/apple/Desktop/java programming workspace/gcr-codebase/com/src/main/resources/Students.csv";  // ✅ your csv file

        int count = 0;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

            // ✅ skip header
            reader.readNext();

            String[] row;
            while ((row = reader.readNext()) != null) {
                count++;
            }

            System.out.println("✅ Total Records (excluding header): " + count);

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}

