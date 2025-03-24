package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerializable {

	public static void main(String[] args) throws  IOException, ClassNotFoundException {

		StudentSerializable s = new StudentSerializable(10, "nikhil");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ayush\\OneDrive\\Desktop\\IO\\inexternilze.txt"));

		out.writeObject(s);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\ayush\\OneDrive\\Desktop\\IO\\inexternilze.txt"));

		s = (StudentSerializable) in.readObject();
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s);
		
		out.close();
		in.close();
	}
}