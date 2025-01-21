package com.oop.ShallowCloning;

public class TestSCloning {
	public static void main(String[] args) throws CloneNotSupportedException {

		Account s = new Account();
		s.balance = 100;

		Account s2 = (Account) s.clone();
		s2.balance = 200;

		System.out.println(s.balance);
		System.out.println(s2.balance);
	}

}
