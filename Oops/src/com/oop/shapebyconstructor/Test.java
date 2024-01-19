package com.oop.shapebyconstructor;

public class Test {
	public static void main(String[] args) {
		Shape[] s = new Shape[2];
		s[0] = new Circle(2.12);
		s[1] = new Rectangle(10, 10);

		System.out.println(s[0].area());
		System.out.println(s[1].area());

		Total(s);
	}

	private static void Total(Shape[] s) {
		double sum = 0.0;
		for (int i = 0; i < s.length; i++) {
			sum = sum + s[i].area();
		}

		System.out.println(sum);

	}
}
