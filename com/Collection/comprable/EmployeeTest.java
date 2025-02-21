package com.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(new Employee(2, "time"));
		l.add(new Employee(4, "work"));
		l.add(new Employee(3, "absent"));
		l.add(new Employee(1, "leave"));
		
		Collections.sort(l);
		for(Object o : l)
		System.out.println(o);
	}
}