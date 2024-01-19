package com.collection.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);
		Employee e2 = new Employee(1, "abc", 100);

		System.out.println("e1.equals(e2) => " + e1.equals(e2));
		System.out.println("e1 hashcode => " + e1.hashCode());
		System.out.println("e2 hashcode => " + e2.hashCode());

	}
}