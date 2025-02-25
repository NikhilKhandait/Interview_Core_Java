package com.comprator;

import java.util.Comparator;

public class EmpSortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		 return o1.getId() - o2.getId(); // Ascending order
		//return o2.getId() - o1.getId(); // descending Order
	}

}
