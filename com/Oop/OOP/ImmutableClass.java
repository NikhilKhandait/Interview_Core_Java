package com.oop.OOP;

/*make class final....1*/
public final class ImmutableClass {

	// All atrribute private and final....2
	private final int id;
	private final String name;

	/*
	 * Define parametrize constructor....3
	 */ public ImmutableClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/* define only getter merthod....4 */
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
