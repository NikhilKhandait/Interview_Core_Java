package com.io;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteLineByLineText {

	public static void main(String[] args) throws IOException  {
		
		//write this on this location using PrintWriter
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\ayush\\OneDrive\\Desktop\\IO\\docfilell.txt", true));
		
		out.println("hello bhai");

		out.println("khelega.. free fire");
 
		out.close();

		System.out.println("data write successfully...!!!");

	}

}