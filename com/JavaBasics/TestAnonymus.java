package com.JavaBasics;

public class TestAnonymus {
	public static void main(String[] args) {

		FunctionalInt f = new FunctionalInt() {

			@Override
			public int doStuff(int a, int b) {

				return a * b;
			}
		};

		int a = 6;
		int b = 5;

		f.add(a, b);
		FunctionalInt.sub(a, b);
		System.out.println(f.doStuff(a, b));

	}

}
