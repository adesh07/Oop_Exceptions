package com.oop.practice;

public class DeepPerson2 implements Cloneable{

	public int id;
	public DeepLocation2 loc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DeepLocation2 getLoc() {
		return loc;
	}

	public void setLoc(DeepLocation2 loc) {
		this.loc = loc;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepPerson2 person = (DeepPerson2)super.clone();
		person.loc= (DeepLocation2)loc.clone();
		return person;
	}

}
