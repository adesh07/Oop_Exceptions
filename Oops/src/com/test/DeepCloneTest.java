package com.test;

public class DeepCloneTest {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		DeepAddress add = new DeepAddress();
		add.setCity("Indore");
		
		DeepStudent s1 = new DeepStudent();
		s1.setId(10);
		s1.setAdd(add);
		
		DeepStudent s2 =(DeepStudent) s1.clone();
		s2.setId(20);
		s2.add.city = "Bhopal";
		
		System.out.println(s1.getId());
		System.out.println(s1.getAdd().city);
		
		System.out.println(s2.getId());
		System.out.println(s2.getAdd().city);
		
	}

}
