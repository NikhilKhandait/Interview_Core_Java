package com.Exception;

public class TryWithMultiCatchss {
	public static void main(String[] args) {

		int a = 4;
		String s = "abc";

		try {
			System.out.println(a / 2);
			System.out.println(s.length());

			System.out.println(s.charAt(6));
			// System.exit(0);// execute all after terminate....

		} catch (ArithmeticException e) {
			e.printStackTrace();
			// System.exit(0);// trminate..
		} catch (NullPointerException e) {
			e.printStackTrace();

		} finally {
			System.out.println("finallll");

		}
	}
}
