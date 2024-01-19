package com.oop.practice2;

public class ShaClonee implements Cloneable{
	
	public int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
