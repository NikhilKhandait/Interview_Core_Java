package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionMethod {
	public static void main(String[] args) {

		Collection c = new ArrayList();
		Collection d = new ArrayList();

		c.add(10);
		c.add(20);
		c.add(50);
		d.add('a');
		d.add('b');
		d.add('c');
		d.add(50);

		System.out.println("ADD in C :" + c.add(40));
		System.out.println("ADD C from D :" + c.addAll(d));
		System.out.println("ADDed Elements is C :" + c);
		System.out.println("if c have 20 :" + c.contains(20));
		System.out.println("if c have all value of c1 :" + c.containsAll(d));
		System.out.println("SIZE of c :" + c.size());
		System.out.println("if c is empty :" + c.isEmpty());
		System.out.println(c.retainAll(d));
		System.out.println("retained c :" + c);
		System.out.println(c.removeAll(d));
		System.out.println(c);

	}
}