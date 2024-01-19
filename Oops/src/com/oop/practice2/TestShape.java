package com.oop.practice2;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Shape [] s = new Shape[2];
		s[0]= new Circle();
		s[1]= new Rectangle();
		
		Circle c = (Circle)s[0];
		c.setRadius(5);
		System.out.println("Triangle : "+s[0].area());
		
		Rectangle r = (Rectangle)s[1];
		r.setLength(10);
		r.setWidth(15);
		System.out.println("Rectangle : "+r.area());
		
		area(s);
		
		

	}

	private static void area(Shape [] s) {
		// TODO Auto-generated method stub
		double totalArea =0.0;
		
		for (int i = 0; i < s.length; i++) {
			
			totalArea += s[i].area();
			
		}
		
		System.out.println("Total : "+totalArea);
	}

}
