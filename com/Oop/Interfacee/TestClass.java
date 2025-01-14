package com.oop.Interfacee;

public class TestClass implements InterfaceOne, InterfaceTwo {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		InterfaceOne t1 = new TestClass();
		System.out.println(t1.sum(20, 10));
		
		InterfaceTwo t2 = new TestClass();
		System.out.println(t2.sum(30, 20, 10));
	}
}
