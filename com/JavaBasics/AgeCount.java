package com.JavaBasics;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {

	public static void main(String[] args) {

		LocalDate lDate = LocalDate.now();
		LocalDate lDate2 = LocalDate.of(2001, 10, 8);
		Period p = Period.between(lDate2, lDate);

		System.out.println(p.getYears());

		/* for cheaking with Month & Date */
		
		// System.out.println(p.getMonths());
		// System.out.println(p.getDays());

	}
}
