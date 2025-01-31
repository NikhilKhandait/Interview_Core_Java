package com.Exception;

public class CheakedException {
	public static void main(String[] args) {

		try {
			manager();
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void manager() throws Exception {
		leader();
	}

	public static void leader() throws Exception {
		employe();
	}

	public static void employe() throws Exception {
		throw new Exception("request for leave..");
	}

}
