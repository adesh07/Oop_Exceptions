package com.oop.withconstructor;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Rectangle(10, 10);
		s[1] = new Circle(10);
		s[2] = new Triangle(10, 10);

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();
		}

		System.out.println("Total Area = " + totalArea);
	}

}
