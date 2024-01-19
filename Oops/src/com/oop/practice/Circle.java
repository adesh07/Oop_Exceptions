package com.oop.practice;

public class Circle extends Shape{
	
	public double r;

	public double getRadius() {
		return r;
	}

	public void setRadius(double r) {
		this.r = r;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

}
