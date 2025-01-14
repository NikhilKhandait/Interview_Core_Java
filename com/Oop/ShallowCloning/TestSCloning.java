package com.oop.ShallowCloning;

public class TestSCloning {
	public static void main(String[] args) throws CloneNotSupportedException {

		ShallowCloning s = new ShallowCloning();

		s.balance = 100;

		ShallowCloning s2 = (ShallowCloning) s.clone();
		s2.balance = 200;

		System.out.println(s.balance);
		System.out.println(s2.balance);
	}

}
