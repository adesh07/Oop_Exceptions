package com.oop.abstractinterface;

public class InterfaceTest implements Interfacee {

	@Override
	public int sum(int a, int b) {
		return a+b;
	}


	public static void main(String[] args) {
		
		InterfaceTest b = new InterfaceTest();
		
		int y = b.sum(x, 20);

		System.out.println(y);
	}
}