package com.Exception;

public class NumberFormatExcp {
public static void main(String[] args) {
	
	String s = "123nikk";
	
	try {
		
		int i = Integer.parseInt(s);
		
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
}
}
