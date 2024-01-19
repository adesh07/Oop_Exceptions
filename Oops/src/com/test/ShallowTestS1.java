package com.test;

public class ShallowTestS1{
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		ShallowS1 s1 = new ShallowS1();
		s1.setRoll(100);
		
		ShallowS1 s2 = (ShallowS1) s1.clone();
		s2.setRoll(200);
		
		System.out.println(s1.getRoll());
		System.out.println(s2.getRoll());
		
	}
	
}