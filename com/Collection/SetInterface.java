package com.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(10);
		hs.add(20);
		hs.add(0);
		hs.add(40);
		hs.add(50);

//		System.out.println(hs.contains(10));
//		System.out.println(hs.isEmpty());
//		System.out.println(hs.size());
//		System.out.println(hs.remove(30));
//		hs.clear();
//		System.out.println(hs);

		TreeSet ts = new TreeSet();

		ts.add(100);
		ts.add(111);
		ts.add(112);
		ts.add(113);
		ts.add(109);

		System.out.println(ts.contains(111));
		System.out.println(ts.ceiling(112));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());// remove 1st
		System.out.println(ts.pollLast());// remove 2nd
		System.out.println(ts.size());
		System.out.println(ts);

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add(100);
		lhs.add(111);
		lhs.add(112);
		lhs.add(113);
		lhs.add(114);
//
//		System.out.println(lhs.contains(111));
//		System.out.println(lhs.isEmpty());
//		System.out.println(lhs.size());
//		System.out.println(lhs.remove(112));
//		System.out.println(lhs.hashCode());
//		System.out.println(lhs.toArray());
//
//		System.out.println(lhs);
	}
}
