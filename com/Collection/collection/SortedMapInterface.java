package com.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
	public static void main(String[] args) {

		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();

		sm.put(1, "nik");
		sm.put(2, "loks");
		sm.put(3, "dip");
		sm.put(4, "yas");
		sm.put(5, "hdep");

		System.out.println(sm.keySet());
		System.out.println(sm.values());
		System.out.println("FirstKey :" + sm.firstKey());
		System.out.println("LastKey :" + sm.lastKey());
		System.out.println("HeadMap :" + sm.headMap(4));// earlier [>]
		System.out.println("Tailmap :" + sm.tailMap(2));// Later [<]
		System.out.println("EntrySet :" + sm.entrySet());// all Entries
		System.out.println("SubMap :" + sm.subMap(2, 4));
	}
}
