package com.oop.cloning;

public class DeepStudent implements Cloneable {

	public int rollno;
	public DeepAddress add;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public DeepAddress getAdd() {
		return add;
	}

	public void setAdd(DeepAddress add) {
		this.add = add;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		DeepStudent student = (DeepStudent) super.clone();
		student.add = (DeepAddress) add.clone();
		return student;
	}

}
