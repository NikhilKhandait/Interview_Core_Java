package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestReverseList {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(6);
		list.add(80);
		list.add(70);
		list.add(24);

		// 1. direct reverse a list
		Collections.reverse(list);
		System.out.println(list);

		// 2. sort a list after reverse a list
		Collections.sort(list);
		System.out.println(list);

		// 3.sort after reverse a list
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);

		// sort and reverse a list in one_line
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

//		List l = new ArrayList();
//
//		for (int i = list.size() - 1; i >= 0; i--) {
//			l.add(list.get(i));
//
//		}
//		System.out.println("Using loop " + l);

	}
}
