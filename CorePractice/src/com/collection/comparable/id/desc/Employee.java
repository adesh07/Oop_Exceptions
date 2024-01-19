package com.collection.comparable.id.desc;

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

	@Override
	public int compareTo(Employee e) {
		return e.id - this.id;
	}

}
