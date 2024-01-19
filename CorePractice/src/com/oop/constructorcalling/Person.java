package com.oop.constructorcalling;

public class Person {

	private String firstName;
	private String lastName;
	private String address;

	public Person() {
		System.out.println("Person default constructor");
	}

	public Person(String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Person 2 param constructor");
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

}
