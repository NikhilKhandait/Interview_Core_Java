package com.Exception;

public class NullPointExceptionn {
public static void main(String[] args) {
	
	String st = null;
	
	try {
		System.out.println(st.length());
	} catch (NullPointerException e) {
		e.printStackTrace();
		
	}
}
}
