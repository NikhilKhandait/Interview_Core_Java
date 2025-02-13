package com.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(40, "fourh");
		m.put(7, null);
		m.put(4, null);

		/* all entries thar we put key/values */
		for(Object o : m.entrySet()) {
			System.out.println(o);
		}

		/* for values only....one...two...three...... */
//		for (Object O : m.values()) {
//			System.out.println(O);
//		}

		/* for keys only....1.2.3.4.5... */
//		for (Object o1 : m.keySet()) {
//			System.out.println(o1);
//		}
//		
//		System.out.println("-----------------------");
//		
//		for (Map.Entry<Integer, String> s : m.entrySet()) {
//			System.out.println(s.getKey() + " " + s.getValue());
//		}

	}
}
