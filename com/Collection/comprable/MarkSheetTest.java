package com.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkSheetTest {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(new MarkSheet("AB33", "Nikhil", 20000));
		list.add(new MarkSheet("AB21", "Lokesh", 100));
		list.add(new MarkSheet("AB43", "xyzz", 500));

		Collections.sort(list);
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
