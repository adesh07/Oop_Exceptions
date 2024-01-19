package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(5, "riya", 100));
		list.add(new Employee(3, "abhi", 900));
		list.add(new Employee(1, "ajay", 500));
		list.add(new Employee(2, "satya", 200));
		list.add(new Employee(2, "aman", 300));

		Collections.sort(list);

		for (Object object : list) {
			System.out.println(object);
		}

	}

}
