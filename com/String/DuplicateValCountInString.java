package com.String;

public class DuplicateValCountInString {

	public static void main(String[] args) {

		String str = "jaiiiishriiiiram";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			String s = Character.toString(str.charAt(i));
			if (s.equals("i")) {

				count++;
			}
		}
		if (count > 0) {
			System.out.println("i" + "=" +count);
		}

	}
}
