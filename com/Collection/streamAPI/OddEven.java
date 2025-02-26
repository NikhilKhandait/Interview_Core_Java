package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class OddEven {
	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(2, 4, 1, 5, 44, 33, 76);
		l.stream().distinct().forEach(c -> {
			if (c % 2 == 0) {
				System.out.println("even :" + c);
			}else {
				System.out.println("odd :" + c);
			}
		});

	}
}
