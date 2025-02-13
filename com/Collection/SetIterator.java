package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetIterator {
	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>();

		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		

		Iterator<Integer> it = t.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}
