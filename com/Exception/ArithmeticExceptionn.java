package com.Exception;

public class ArithmeticExceptionn {
	public static void main(String[] args) {

		int a = 10;

		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
