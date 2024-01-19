package com.oop.practice2;

public class TestShapeCons {

	public static void main(String[] args) {

		Shape[] s= new Shape[2];
		s[0] = new CircleC(5);
		s[1]=new RectangleC(11, 12);
		
		System.out.println(s[0].area());
		System.out.println(s[1].area());
		
		area(s);
		
		
	}

	private static void area(Shape[] s) {
		// TODO Auto-generated method stub
	double 	totalArea =0.0;
	
	for (int i = 0; i < s.length; i++) {
		
		totalArea += s[i].area();
	}
		System.out.println(totalArea);
	}

}
