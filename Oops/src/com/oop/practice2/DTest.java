package com.oop.practice2;

public class DTest {

	public static void main(String[] args) throws CloneNotSupportedException{

		DAddress add=new DAddress();
		add.setCity("Indore");
		
		DStudent s1 = new DStudent();
         s1.setAdd(add);
		 s1.setId(101);
		
		DStudent s2 =  (DStudent)s1.clone();
		s2.add.city="Bhopal";
        s2.setId(102);
        
        System.out.println(s1.id +" "+s1.add.city);
        System.out.println(s2.id +" "+s2.add.city);
	}

}
