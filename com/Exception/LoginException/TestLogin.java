package com.Exception.LoginException;

public class TestLogin {
	public void login(String userName, String pass) throws LoginExceptions {

		String userN = "nikhil";
		String pas = "1234";

		if (!userN.equals(userName)) {
			throw new LoginExceptions("Invalid User");
		}
		if (!pas.equals(pass)) {
			throw new LoginExceptions("Invalid Password");
		}

	}

	public static void main(String[] args) {

		TestLogin t = new TestLogin();
		try {
			t.login("abcs", "321");
		} catch (LoginExceptions e) {
			System.out.println(e.getMessage());
		}
	}
}
