package com.String;

public class CountChar {

	public static void main(String[] args) {

		String str = "nikhil khandait";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			Character.toString(str.charAt(i));
			count++;
		}
		if (count > 0) {

			System.out.println("Accurance of string is"+" "+count);
		}
	}
}