package com.oop.shapearray;

public class Rectangle extends Shape {

	private double length;
	private double width;
	
	
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	
	
	
	
	
	
	

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {

		return length * width;

	}
}
