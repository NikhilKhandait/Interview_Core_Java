package com.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
	public static void main(String[] args) {

		SortedSet<Integer> s = new TreeSet<Integer>();
		s.add(100);
		s.add(200);
		s.add(10);
		s.add(400);
		s.add(500);

		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.size());
		System.out.println(s.headSet(100));
		System.out.println(s.tailSet(400));

		/* out of elements number can also enter */

		// System.out.println(s.headSet(700));
		// System.out.println(s.tailSet(300));

	}
}
