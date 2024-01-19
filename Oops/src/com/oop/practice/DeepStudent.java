package com.oop.practice;

public class DeepStudent implements Cloneable {

	public int id;
	public DeepAddress add;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DeepAddress getAdd() {
		return add;
	}

	public void setAdd(DeepAddress add) {
		this.add = add;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepStudent student = (DeepStudent)super.clone();
		student.add = (DeepAddress)add.clone();
		return student;
	}

}
