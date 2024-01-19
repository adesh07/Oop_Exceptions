package com.oop.practice;

public class DeepTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub

		DeepAddress add = new DeepAddress();
		add.setCity("Indore");
		
		DeepStudent s1 = new DeepStudent();
		s1.setId(101);
		s1.setAdd(add);
		
		DeepStudent s2 = (DeepStudent)s1.clone();
		s2.setId(102);
		s2.add.city="Bhopal";
		
		
		
	System.out.println(s1.getId());
	System.out.println(s1.getAdd().city);
	
	System.out.println(s2.getId());
    System.out.println(s2.getAdd().city);	
	}

}
