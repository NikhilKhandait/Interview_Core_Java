package com.streamAPI;

import java.util.Arrays;

public class MinMax {
public static void main(String[] args) {
	
	int[] a = {2,1,4,16,33,4,22,88};
	
	Arrays.stream(a).max().ifPresent(System.out::println);
	Arrays.stream(a).min().ifPresent(System.out::println);
}
}
