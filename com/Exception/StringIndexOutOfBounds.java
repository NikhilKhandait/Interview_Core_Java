package com.Exception;

public class StringIndexOutOfBounds {
public static void main(String[] args) {
	
	String s = "nikhilll";
	
	try {
		System.out.println(s.charAt(11));
	}catch(StringIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
}
}
