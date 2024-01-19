package com.exception.examples;

public class Account {

	private int balance = 0;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposite(int amount) {

		int total = getBalance() + amount;

		setBalance(total);

		System.out.println("Balance after deposite = " + getBalance());
	}

	public void withdrawl(int amount) throws InsufficientFundBalance {

		int total = getBalance() - amount;

		if (total >= 2000) {

			setBalance(total);

			System.out.println("Balance after withdrawl = " + getBalance());

		} else {

			InsufficientFundBalance e = new InsufficientFundBalance();

			throw e;
		}
	}
}
