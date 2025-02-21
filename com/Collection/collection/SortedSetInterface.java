package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
	public static void main(String[] args) {

		SortedSet s = new TreeSet();
		
		s.add(100);
		s.add(200);
		s.add(70);
		s.add(400);
		s.add(500);
	//	s.add("lokesh");
		

		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.size());
		System.out.println(s.headSet(100));
		System.out.println(s.tailSet(400));
		System.out.println(s.subSet(100, 400));
		System.out.println(s);
		
		/* out of set elements number can also enter */

		// System.out.println(s.headSet(700));
		// System.out.println(s.tailSet(300));

	}
}
