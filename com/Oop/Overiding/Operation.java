package com.oop.Overiding;

public class Operation extends Math {

	@Override
	public void add() {
		System.out.println("Addititon of values is..!!");
	}
	
	public static void main(String[] args) {
		Math a = new Operation();
		a.add();
		
		
	}
}
