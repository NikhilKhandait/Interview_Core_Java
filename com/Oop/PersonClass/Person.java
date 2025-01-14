package com.oop.PersonClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	public int id;
	public Date dob;
	public static final int AVG_AGE = 23;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public static void main(String[] args) throws ParseException {

		Person p = new Person();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		p.setId(1);
		p.setDob(sdf.parse("2010-01-01"));
		System.out.println("ID :" + p.getId());
		System.out.println(p.getDob());
		System.out.println("AGE :" + p.AVG_AGE);
	}
}
