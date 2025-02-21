package com.equalHashCode;

public class EmployeeTest1 {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 124);
	    Employee e2 = new Employee(1, "abc", 123);

		if (e1.equals(e2)) {
			if (e1.hashCode() == e2.hashCode()) {
				System.out.println("Hashcode are equals");
			}
			System.out.println("object are equals");
		} else {
			System.out.println("not equals");
		}

		System.out.println(e1.hashCode() == e2.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}

}
