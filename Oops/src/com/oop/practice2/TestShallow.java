package com.oop.practice2;

public class TestShallow {
	
	public static void main(String[] args)  throws CloneNotSupportedException{
		
	
	ABC a1 = new ABC();
	a1.id = 101;
	
	ABC a2 = (ABC)a1.clone();
	a2.id=102;
	
	System.out.println(a1.id);
    System.out.println(a2.id);	
	
	}

	

}
