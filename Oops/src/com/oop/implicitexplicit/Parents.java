package com.oop.implicitexplicit;

public class Parents {

	public String name;

	public Parents() {
		System.out.println("this is parent class");
	}

	public Parents(String name) {
		//this();
		this.name = name;
		System.out.println(name);
	}

}
