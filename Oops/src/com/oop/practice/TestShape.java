package com.oop.practice;


public class TestShape {

	public static void main(String[] args) {

		Shape [] s = new Shape[2];
		
		s[0] = new Circle();
		s[1] = new Ractangle();
		
		Circle c = (Circle) s[0];
		c.setRadius(5);
		System.out.println(c.area());
		
		
		Ractangle r = (Ractangle) s[1];
		r.setLength(10);
		r.setWidth(15);
		System.out.println(r.area());
		
		double a = area(s);
		System.out.println(a);
 		
		

	}

	private static double area(Shape[] s) {
      double a =0;
      
      for (int i = 0; i < s.length; i++) {
    	  
    	  a = a + s[i].area();
		
	}
		
		return a;
	}

}
