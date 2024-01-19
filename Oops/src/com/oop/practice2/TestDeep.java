package com.oop.practice2;

public class TestDeep {

	public static void main(String[] args) throws CloneNotSupportedException {

	   	DeepAdd add = new DeepAdd();
		add.setCity("Indore");
		
		DeepClonee d1 = new DeepClonee();
		d1.setId(101);
		d1.setAdd(add);
		
		DeepClonee d2 = (DeepClonee)d1.clone();
		d2.setId(102);
		d2.add.city="Bhopal";
		
		System.out.println(d1.id+" "+d1.add.city);

		System.out.println(d2.id+" "+d2.add.city);
		
	}

}
