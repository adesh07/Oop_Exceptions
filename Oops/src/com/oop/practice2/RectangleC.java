package com.oop.practice2;

public class RectangleC extends Shape{
	
	private int length;
	private int width;
	
	public RectangleC(int length,int width) {
		this.length=length;
		this.width=width;
		
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

}
