package com.oop.shapebyconstructor;

public class Circle extends Shape {

	public double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return 3.14 * radius * radius;
	}
}
