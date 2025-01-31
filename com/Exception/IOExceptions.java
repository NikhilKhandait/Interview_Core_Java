package com.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptions {
	public static void main(String[] args) {

		try {
			FileReader file = new FileReader("myfile.txt");
			int data;
			while ((data = file.read()) != -1) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
