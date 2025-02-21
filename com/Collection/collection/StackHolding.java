package com.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class StackHolding {
	public static void main(String[] args) {

		/* LIFO(Principle)->>>Last In - First Out */
		Stack s = new Stack();

		for (char i = 'a'; i < 'h'; i++) {
			s.push(i);
		}
		Stack s1 = new Stack();

		while (!s.isEmpty()) {
			s1.push(s.pop());

		}
		System.out.println(s1);

		while (!s1.isEmpty()) {
			s.push(s1.pop());
		}
		System.out.print(s);
	}
}
