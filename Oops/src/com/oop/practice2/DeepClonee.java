package com.oop.practice2;

public class DeepClonee implements Cloneable{

	public int id;
	public DeepAdd add;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DeepAdd getAdd() {
		return add;
	}

	public void setAdd(DeepAdd add) {
		this.add = add;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		DeepClonee student = (DeepClonee)super.clone();
		student.add=(DeepAdd)add.clone();
		return student;
	}
}
