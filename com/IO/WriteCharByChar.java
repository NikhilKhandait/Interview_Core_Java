package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharByChar {
	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("C:\\Users\\ayush\\OneDrive\\Desktop\\IO\\writechar.txt");

		file.write('A');
		file.write('C');
		file.write('V');
		file.write('A');
		file.write('E');
		file.write('B');
		
		System.out.println("done............");
		file.close();
	}
}
