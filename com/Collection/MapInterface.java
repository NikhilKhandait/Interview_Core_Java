package com.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");

//		System.out.println(map.containsKey(1));//1
//		System.out.println(map.containsValue("c"));//2
//		System.out.println(map.size());//3
//		System.out.println(map.get(2));//4
//		map.putIfAbsent(6, "dog");//5
//		map.replace(3, "cat");//6
//		System.out.println(map.isEmpty());//7
//		System.out.println(map.keySet());//8
//		System.out.println(map.values());//9
//		System.out.println("Exist in map :" + map);

		TreeMap tm = new TreeMap();

		tm.put(1, "apple");
		tm.put(2, "bat");
		tm.put(3, "cow");
		tm.put(4, "dev");
		tm.put(5, "enf");

//		System.out.println(tm.firstKey());
//		System.out.println(tm.lastKey());
//		System.out.println(tm.pollFirstEntry());// remove 1st element
//		System.out.println(tm.pollLastEntry());// remove last element
//		System.out.println(tm.firstEntry());
//		System.out.println(tm.lastEntry());
//		System.out.println("lower key :" + tm.lowerEntry(5));// Lower of 5
//		System.out.println("higer key :" + tm.higherEntry(2));// Higher og 2
//		System.out.println(tm);

		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put(1, "apple");
		lhm.put(2, "bat");
		lhm.put(3, "cow");
		lhm.put(4, "dev");
		lhm.put(5, "enf");
		
		lhm.replace(2, "ball");
		lhm.remove(5);
		System.out.println(lhm.entrySet());
		System.out.println(lhm.keySet());
		System.out.println(lhm.values());
		System.out.println(lhm);
		
		
		

	}
}
