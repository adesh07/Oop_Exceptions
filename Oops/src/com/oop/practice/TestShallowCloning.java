package com.oop.practice;

public class TestShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		ShallowCloning s1 = new ShallowCloning();
		s1.rollno= 101;
		
		ShallowCloning s2 = (ShallowCloning)s1.clone();
		s2.rollno=102;
		
		
		System.out.println(s1.rollno);
		System.out.println(s2.rollno);

	}

}
