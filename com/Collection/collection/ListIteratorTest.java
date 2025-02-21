package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add("nikhil");
		l.add("khandait");

		ListIterator li = l.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
	}
}
