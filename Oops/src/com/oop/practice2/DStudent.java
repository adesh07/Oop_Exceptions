package com.oop.practice2;

public class DStudent implements Cloneable{

	public int id;
	public DAddress add;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DAddress getAdd() {
		return add;
	}
	public void setAdd(DAddress add) {
		this.add = add;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		DStudent student = (DStudent)super.clone();
		student.add= (DAddress)add.clone();
		return student;
	}
}
