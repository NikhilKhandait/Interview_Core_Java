package com.JavaBasics;

public class PrimeNumber {
	public static void main(String[] args) {

		int num = 19;
		boolean flag = false;

		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println( num + "this is prime num");
		} else {
			System.out.println("this is not prime");
		}
	}
}
