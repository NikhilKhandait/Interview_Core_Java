package com.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmpAll {
	
	/* common class of all superClass */
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee("kapil", 3, 2000));
		list.add(new Employee("a", 1, 1000));
		list.add(new Employee("b", 2, 3000));
		list.add(new Employee("c", 1, 5000));
		list.add(new Employee("a", 5, 2000));

//		System.out.println(list);

		EmpSortById byId = new EmpSortById();

		Collections.sort(list, byId);

		System.out.println("...........ShortById........");

		Iterator itt = list.iterator();
		while (itt.hasNext()) {
			System.out.println(itt.next());
		}

//		System.out.println("...........ShortByName........");
//		
//		EmpSortByName byName = new EmpSortByName();
//		
//		Collections.sort(list , byName);
//		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		System.out.println("...........ShortBySalary........");
//		
//		EmpSortBySalary bySalary = new EmpSortBySalary();
//		
//		Collections.sort(list , bySalary);
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		EmpSortByIdName byIdName = new EmpSortByIdName();
//		
//		Collections.sort(list , byIdName);
//		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		EmpSortByIdNameSalary byIdNameSalary = new EmpSortByIdNameSalary();
//
//		Collections.sort(list, byIdNameSalary);
//
//		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
}
