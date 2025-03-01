package com.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContWiner {
	public static void main(String[] args) {

		List<ContestWinner> list = new ArrayList<ContestWinner>();

		list.add(new ContestWinner("nikhil", "839209"));
		list.add(new ContestWinner("lokesh", "86839"));
		list.add(new ContestWinner("yash", "24839"));
		list.add(new ContestWinner("dipesh", "57482"));
		list.add(new ContestWinner("hardep", "183754"));

		list.stream()
		.map(e -> e.getName()+ " " + e.getSalary())
		.distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(), c -> {
					Collections.shuffle(c);
					return c.stream();
				})).limit(2).forEach(c -> System.out.println(c));

		
		
	}
}
