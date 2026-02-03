package com.salaryupdater;

import java.io.*;
/*
 * 
6️. Modify a CSV File (Update a Value)
Read a CSV file and increase the salary of employees from the "IT" department by 10%.
Save the updated records back to a new CSV file.
 */
public class SalaryUpdater {
	public static void main(String[] args) {
		String input = "/Users/apple/Desktop/java programming workspace/gcr-codebase/com/src/main/resources/employees.csv";
		String output = "/Users/apple/Desktop/java programming workspace/gcr-codebase/com/src/main/resources/employees_updated.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(input));
				PrintWriter pw = new PrintWriter(new FileWriter(output))) {

			String line = br.readLine();
			pw.println(line); // Write header as is

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				double salary = Double.parseDouble(data[3]);

				if (data[2].equalsIgnoreCase("HR")) {
					salary *= 1.10; // 10% Increase
				}

				// Reconstruct the line
				data[3] = String.format("%.2f", salary);
				pw.println(String.join(",", data));
			}
			System.out.println("Update complete. Saved to: " + output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}