package com.oop.practice3;

public class Tringle extends Shape{
	
	public int radius;
	
	public Tringle(int radius) {
		this.radius=radius;
	}

	@Override
	public double area() {
		return 3.14*radius*radius;
	}
}
