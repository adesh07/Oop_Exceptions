package com.oop.practice2;

public class TestShh {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
		ShaClonee sh1 = new ShaClonee();
		sh1.setId(101);
		
		ShaClonee sh2 = (ShaClonee)sh1.clone();
		sh2.setId(102);
		
		System.out.println(sh1.id);
		System.out.println(sh2.id);

	}

}
