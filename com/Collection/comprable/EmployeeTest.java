package com.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(new Employee(5, "time"));
		l.add(new Employee(4, "work"));
		l.add(new Employee(4, "cab"));
		l.add(new Employee(5, "absent"));
		l.add(new Employee(1, "leave"));
		l.add(new Employee(5, "ceave"));

		Collections.sort(l);
		for (Object o : l)
			System.out.println(o);
	}
}