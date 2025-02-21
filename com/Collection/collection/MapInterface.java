package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(null, null);
		map.put(null, "abc");
		map.put(null, "cmm");
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");

//		System.out.println(map);
//		System.out.println("contains key : " + map.containsKey(1));
//		System.out.println("contains value : " +map.containsValue("c"));
//		System.out.println("size : " +map.size());
//		System.out.println("get : " +map.get(0));
//		System.out.println(map.putIfAbsent(8, "f"));
//		System.out.println(map.replace(4, "eat"));
//		System.out.println("if empty : " +map.isEmpty());
//		System.out.println("keys all : " +map.keySet());
//		System.out.println("all values : " +map.values());
//		System.out.println("Exist in map :" + map);

		TreeMap tm = new TreeMap();

		tm.put(9, null);
		tm.put(1, "apple");
		tm.put(2, "bat");
		tm.put(3, "cow");
		tm.put(4, "dev");
		tm.put(5, "enf");

		System.out.println(tm);
		System.out.println("contains key : " + tm.containsKey(0));
		System.out.println("contains value : " + tm.containsValue("hshs"));
		System.out.println("First key : " + tm.firstKey());
		System.out.println("Last key : " + tm.lastKey());
		System.out.println("pollFirst Entry : " + tm.pollFirstEntry());//return + remove 1st 
		System.out.println("pollLast Entry : " + tm.pollLastEntry());// remove + return  last element
		System.out.println(tm);
		System.out.println("FirstEntry : " + tm.firstEntry());
		System.out.println("LastEntry : " + tm.lastEntry());
		System.out.println("lower key : " + tm.lowerEntry(5));// Lower of 5c
		System.out.println("higer key : " + tm.higherEntry(2));// Higher og 2
		System.out.println(tm);

		LinkedHashMap lhm = new LinkedHashMap();

		lhm.put(1, "apple");
		lhm.put(2, "bat");
		lhm.put(3, "cow");
		lhm.put(4, "dev");
		lhm.put(5, "enf");
		
		

//		System.out.println(lhm.replace(2, "ball"));
//		System.out.println(lhm.remove(5));
//		System.out.println(lhm.entrySet());
//		System.out.println(lhm.keySet());
//		System.out.println(lhm.values());
//		System.out.println(lhm);

	}
}
