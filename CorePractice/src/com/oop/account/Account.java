package com.oop.account;

public class Account {

	private int balance;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposite(int amount) {

		int updatedBalance = getBalance() + amount;

		setBalance(updatedBalance);

		System.out.println("balance after deposite = " + getBalance());

	}

	public void withdrawl(int amount) {

		int remainingBalance = getBalance() - amount;

		if (remainingBalance < 2000) {
			System.out.println("Low Balance...!!!");
		} else {
			setBalance(remainingBalance);
			System.out.println("balance after withdrawl = " + getBalance());
		}
	}
}
