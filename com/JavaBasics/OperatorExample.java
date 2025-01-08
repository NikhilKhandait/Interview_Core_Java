package com.JavaBasics;

public class OperatorExample {
	public static void main(String[] args) {

		int a = 5;
		int b = 4;

		char operator = '/';

		switch (operator) {

		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '%':
			System.out.println(a % b);
			break;
		case '/':
			if (b != 0) {
				System.out.println("div :" + a / b);
			} else {
				System.out.println("Not Divisible");
			}
			break;
		case '*':
			System.out.println(a * b);
			break;

		default:
			System.out.println("invalid operator");
		}
	}
}
