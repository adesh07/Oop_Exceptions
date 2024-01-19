package com.exception.examples;

public class TestStringIndexOutOfBoundsException {

	public static void main(String[] args) {

		String name = "abc";

		try {

			System.out.println(name.charAt(4));

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

}
