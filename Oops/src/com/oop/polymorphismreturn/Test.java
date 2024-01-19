package com.oop.polymorphismreturn;

public class Test {
	public static void main(String[] args) {

		// Shape s = new Shape();

		Shape s1 = Shape.getShape(1);

		System.out.println(s1.area());

	}
}
