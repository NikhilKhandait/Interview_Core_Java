package com.oop.MethodOverLoading;

public class MethodOverLoading {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		System.out.println(m.sum(10, 20));
		System.out.println(m.sum(10, 20, 30));
	}
}
