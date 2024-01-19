package com.collection.equalshashcode;

public class Employee {

	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Employee)) {

			return false;
		}

		Employee e = (Employee) obj;

		boolean b = this.id == e.id && this.name == e.name && this.salary == e.salary;

		return b;

	}

	@Override
	public int hashCode() {
		String str = id + name + salary;
		return str.hashCode();
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

}
