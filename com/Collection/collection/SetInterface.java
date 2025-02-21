package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(50);

//		System.out.println("contains : " + hs.contains(10));
//		System.out.println("empty : " + hs.isEmpty());
//		System.out.println("size : " + hs.size());
//		System.out.println("remove : " + hs.remove(20));
//		System.out.println("add : " + hs.add(33));
//		// hs.clear();
//		System.out.println(hs);

		TreeSet ts = new TreeSet();

		
		
		ts.add(100);
		ts.add(109);
		ts.add(111);
		ts.add(112);
		ts.add(113);
		ts.add(114);

		System.out.println("-------treeset------- ");

		System.out.println("floor :" + ts.floor(114));
		System.out.println("Ceiling :" + ts.ceiling(111));
		System.out.println(ts);
		System.out.println("first :" + ts.first());
		System.out.println("last :" + ts.last());
		System.out.println("Higher :" + ts.higher(100));
		System.out.println("lower :" + ts.lower(114));
		System.out.println("subSet :" + ts.subSet(111, 113));
		System.out.println("pollFirst :" + ts.pollFirst());//return + remove 1st
		System.out.println("pollLast :" + ts.pollLast());//return + remove last
		System.out.println("size :" + ts.size());
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
//		System.out.println(lhs);
	}
}
