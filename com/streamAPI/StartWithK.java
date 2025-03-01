package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StartWithK {
	public static void main(String[] args) {

		List<String> l = Arrays.asList("kapil", "ram", "kunal", "hasrsh");
		
		l.stream().map(e -> e.toUpperCase()).filter(e -> e.startsWith("K")).distinct()
		.sorted().forEach(System.out::println);

	}
}
