package com.oop.cloning;

public class DeepTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		DeepAddress add = new DeepAddress();
		add.setCity("Indore");

		DeepStudent s = new DeepStudent();
		s.setRollno(101);
		s.setAdd(add);

		DeepStudent st = (DeepStudent) s.clone();
		st.setRollno(105);
		st.add.city = "bhopal";

		
		System.out.println(s.getRollno());
		System.out.println(s.getAdd().city);

		System.out.println("--------------------------------------");

		System.out.println(st.getRollno());
		System.out.println(st.getAdd().city);

	}

}
