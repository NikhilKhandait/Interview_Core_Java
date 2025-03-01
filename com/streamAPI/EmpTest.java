package com.streamAPI;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class EmpTest {
	public static void main(String[] args) {

		List<Emp> l = new ArrayList<Emp>();

		l.add(new Emp(4, "yash"));
		l.add(new Emp(2, "jay"));
		l.add(new Emp(5, "ajay"));
		l.add(new Emp(2, "vijay"));
		l.add(new Emp(1, "ram"));

		//by id
		l.stream().sorted(Comparator.comparingInt(Emp::getId))
				.forEach(e -> System.out.println(e.getId() + ":" + e.getName()));

		System.out.println();

		//by Name
		l.stream().sorted(Comparator.comparing(Emp::getName))
				.forEach(e -> System.out.println(e.getId() + ":" + e.getName()));

	}
}
