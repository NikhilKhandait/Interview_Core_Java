package com.streamAPI;

import java.util.stream.Stream;

public class StreamToArray {
	public static void main(String[] args) {

		Stream<String> stream = Stream.of("b", "c", "s");

		String[] arr = stream.toArray(e -> new String[e]);

		System.out.println(arr[2]);

	}
}
