package com.oop.reference;

public class TestReference {
	public static void main(String[] args) {
		
		Reference r = new Reference();
		r.rollno=101;
		
		Reference r1= r;
		r1.rollno=500;
		
		
		System.out.println(r.rollno);
		System.out.println(r1.rollno);
	}

}
