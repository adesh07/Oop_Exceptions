package com.collection.comparable;

public class Employee implements Comparable<Employee> {

	public int id;
	public String name;
	public int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}

	// if ID same thn compare by NAME
	@Override
	public int compareTo(Employee e) {

		if (this.id == e.id) {
			return this.name.compareTo(e.name);
		}

		return this.id - e.id;

	}

}
