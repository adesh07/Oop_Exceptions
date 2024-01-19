package com.test;

public class ShallowS1 implements Cloneable{
	
	public int roll;
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}