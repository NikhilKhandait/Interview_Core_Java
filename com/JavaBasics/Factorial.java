package com.JavaBasics;

public class Factorial {

	public static void main(String[] args) {

		int a = 5;

		int res = 1;
		while (a > 0) {

			res = res * a;
			a--;
		}
		System.out.println(res);
	}
}
