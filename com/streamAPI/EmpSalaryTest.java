package com.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class EmpSalaryTest {
	public static void main(String[] args) {

		List<EmployeSalary> l = new ArrayList<EmployeSalary>();

		l.add(new EmployeSalary(20000, "nihk"));
		l.add(new EmployeSalary(30000, "abse"));
		l.add(new EmployeSalary(50000, "kalse"));
		l.add(new EmployeSalary(10000, "fhsu"));

		l.stream()
		.distinct().
		filter(c -> c.getSalary() >= 20000)
		.forEach(c -> System.out.println(c.getName() + ":" + c.getSalary()));

		
	}
}
