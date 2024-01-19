package com.oop.abstractinterface;

public class AbstractTest extends Abstractexample {
	
	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	
	
	public static void main(String[] args) {

		AbstractTest t = new AbstractTest();

		int sum = t.add(10, 20);
		System.out.println(sum);

	}
	
}
