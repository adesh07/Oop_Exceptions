package com.oop.practice;

public class DeepLocation2 implements Cloneable{
	
	public String city;

	public String getLoc() {
		return city;
	}

	public void setLoc(String loc) {
		this.city = city;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
