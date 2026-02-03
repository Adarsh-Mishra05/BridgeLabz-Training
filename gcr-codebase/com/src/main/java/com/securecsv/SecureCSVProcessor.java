package com.securecsv;

import java.io.*;
import java.util.Base64;

public class SecureCSVProcessor {
	// Encrypts a string
	private static String encrypt(String data) {
		return Base64.getEncoder().encodeToString(data.getBytes());
	}

	// Decrypts a string
	private static String decrypt(String encryptedData) {
		return new String(Base64.getDecoder().decode(encryptedData));
	}

	public static void main(String[] args) throws IOException {
		String path = "/Users/apple/Desktop/java programming workspace/gcr-codebase/com/src/main/resources/secure_employees.csv";

		// Writing Encrypted Data
		try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
			pw.println("ID,Name,Salary(Encrypted)");
			pw.println("101,Adarsh Mishra," + encrypt("175000"));
		}

		// Reading and Decrypting
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			br.readLine(); // Header
			String line = br.readLine();
			String[] d = line.split(",");
			System.out.println("ID: " + d[0] + " | Name: " + d[1] + " | Salary: " + decrypt(d[2]));
		}
	}
}
