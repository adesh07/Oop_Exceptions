package com.oop.practice;

public class DeepAddress implements Cloneable{

	public String city;

	public void setCity(String city) {
		this.city=city;
	}
	
	public String getCity(String city) {
		return this.city;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
