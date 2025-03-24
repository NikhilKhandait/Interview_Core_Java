package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

public class EmailReadWrite {
	public static void main(String[] args) throws IOException {
		//mail read in this location
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ayush\\OneDrive\\Desktop\\IO\\mail.txt"));
		//writer mail form here
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\ayush\\OneDrive\\Desktop\\IO\\blankmail.txt"));

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+" + "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String line = reader.readLine();
		while (line != null) {
			if (line.matches(emailreg)) {
				out.println(line);
			}
			line = reader.readLine();
		}
		out.close();
		reader.close();
	}
}