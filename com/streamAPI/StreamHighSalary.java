package com.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHighSalary {
	public static void main(String[] args) {

		List list = new ArrayList();
		
		list.add(100);
		list.add(300);
		list.add(209);
		list.add(500);
		list.add(605);
		list.add(102);
		
		list.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(e ->
		System.out.println(e));
		
		list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(e ->
		System.out.println(e));
		
		
	}

}
