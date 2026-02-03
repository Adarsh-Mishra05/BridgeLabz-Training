package com.csvvalidator;

import java.io.*;
import java.util.regex.Pattern;

public class CSVValidator {
	private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("/Users/apple/Desktop/java programming workspace/gcr-codebase/com/src/main/resources/Students.csv"))) {
			String line;
			br.readLine(); // Skip header
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String email = data[4].trim();
				String phone = data[5].trim();

				boolean isEmailValid = EMAIL_PATTERN.matcher(email).matches();
				boolean isPhoneValid = phone.matches("\\d{10}");

				if (!isEmailValid || !isPhoneValid) {
					System.out.println(" Invalid Row: " + line + " (Reason: " + (!isEmailValid ? "Bad Email " : "")
							+ (!isPhoneValid ? "Bad Phone" : "") + ")");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}