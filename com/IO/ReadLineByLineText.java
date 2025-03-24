package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineText {
public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ayush\\OneDrive\\Desktop\\IO\\lineby.txt"));
	String str = br.readLine();
	
	while (str != null) {
		System.out.println(str);
		str = br.readLine();
	}
	
	
	br.close();
	
}
}
