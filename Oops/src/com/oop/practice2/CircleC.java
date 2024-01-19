package com.oop.practice2;

public class CircleC extends Shape{
	
private int radius;

public CircleC(int radius) {
	this.radius=radius;
}

@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
}
