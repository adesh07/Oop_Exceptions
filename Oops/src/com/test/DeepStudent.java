package com.test;

public class DeepStudent implements Cloneable {

	public int id;
	public DeepAddress add;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setAdd(DeepAddress add) {
		this.add = add;
	}

	public DeepAddress getAdd() {
		return add;
	}

	public Object clone() throws CloneNotSupportedException {
		DeepStudent stud = (DeepStudent) super.clone();
		stud.add = (DeepAddress) add.clone();
		return stud;
	}
}
