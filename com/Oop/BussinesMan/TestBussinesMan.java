package com.oop.BussinesMan;

public class TestBussinesMan implements RichMan, SocialWorkers {

	@Override
	public void earnMoney(double money) {
		System.out.println("Earn money by richMan :" + money);
	}

	@Override
	public void donationMoney(double donationMoney) {
		System.out.println("Donation money by rechMan :" + donationMoney);
	}

	@Override
	public void party() {
		System.out.println("RichMan do  party");
	}

	@Override
	public void helpOthers() {
		System.out.println("Social work help other...");
	}

	public static void main(String[] args) {

		RichMan t1 = new TestBussinesMan();
		t1.earnMoney(10000);
		t1.donationMoney(2000);
		t1.party();

		SocialWorkers s1 = new TestBussinesMan();
		s1.helpOthers();
	}
}
