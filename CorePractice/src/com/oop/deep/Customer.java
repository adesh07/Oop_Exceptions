package com.oop.deep;

public class Customer implements Cloneable {

	public String name = null;
	public Account account = null;

	public Customer(String name, Account account) {
		this.name = name;
		this.account = (Account) account;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Customer c = (Customer) super.clone();

		c.account = (Account) account.clone(); // if we remove this line, thn it work as shallow.

		return c;
	}

}
