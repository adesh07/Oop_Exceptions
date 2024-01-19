package com.oop.constructorcalling;

public class Employee extends Person {

	private String designation;

	public Employee() {
		System.out.println("employee default constructor");
	}

	public Employee(String firstName, String lastName, String designation) {
		super(firstName, lastName);
		this.designation = designation;
		System.out.println("employee 3 param constructor");
	}

	public String getDesignation() {
		return designation;
	}

}
