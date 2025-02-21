package com.equalHashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeTest2 {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "one", 100);
		Employee e2 = new Employee(1, "one", 100);
		Employee e3 = new Employee(3, "three", 300);

		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println();

		System.out.println("--------------TEST-LIST-------------");

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);// List allow duplicate object....
		System.out.println(list);
		System.out.println();

		System.out.println("--------------TEST-SET-------------");

		Set<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);// e1 & e2 are similar so only one instance will be store
		set.add(e3);
		System.out.println(set);// print only two instance of object
		System.out.println();

		System.out.println("--------------TEST-MAP------------------");

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

		map.put(1, e1);// map store all object bcoz its based on key
		map.put(2, e2);
		map.put(3, e3);

		// System.out.println(map.remove(2, e2));
		System.out.println(map);
	}
}
