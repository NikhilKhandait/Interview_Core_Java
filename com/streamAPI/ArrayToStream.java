package com.streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {

		String[] str = { "a", "b", "c", "a", "e" };

		Stream<String> strm = Arrays.stream(str);

		strm.forEach(System.out::println);
		
		
	}
}
