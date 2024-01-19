package com.oop.cloning;

public class ShallowCloneeTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		ShallowClonee sh1 = new ShallowClonee();
		// sh1.rollno = 100;
		   sh1.setRollno(101);

		ShallowClonee sh2 = (ShallowClonee) sh1.clone();
		// sh2.rollno = 200;
		   sh2.setRollno(102);

		System.out.println(sh1.getRollno());
		System.out.println(sh2.getRollno());

		// System.out.println(sh1.rollno);
		// System.out.println(sh2.rollno);

	}

}
