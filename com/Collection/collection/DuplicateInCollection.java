 package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInCollection {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList();

		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(300);
		l.add(200);

		// use set bcoz its not allow duplicate
		Set unique = new HashSet();

		// another list where store duplicate
		List duplicate = new ArrayList();

		for (Object o : l) {
			if (!unique.add(o)) {
				duplicate.add(o);
			}
		}

		System.out.println(duplicate);
		// System.out.println(unique);
	}
}
