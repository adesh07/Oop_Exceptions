package com.exception.examples;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.deposite(5000);

		try {

			a.withdrawl(3001);

		} catch (InsufficientFundBalance e) {

			System.out.println(e);

		}

		a.deposite(1000);

	}

}
