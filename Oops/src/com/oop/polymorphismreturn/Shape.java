package com.oop.polymorphismreturn;

public class Shape {
	
	public Shape() {
		// TODO Auto-generated constructor stub
	} 
	
	public double area() {
		
		return 0;
	}

	public static Shape getShape(int i) {
		
		if (i==1) {
			return new Rectangle(5,6);
		}
		if (i==2) {
			return new Circle(4);
		}
		return new Shape();
	}
}
