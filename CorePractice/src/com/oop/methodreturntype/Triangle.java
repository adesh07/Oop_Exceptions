package com.oop.methodreturntype;

public class Triangle extends Shape {

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double area() {

		double tArea = (base * height) / 2;

		System.out.println("Triangle Area = " + tArea);

		return tArea;
	}

}
