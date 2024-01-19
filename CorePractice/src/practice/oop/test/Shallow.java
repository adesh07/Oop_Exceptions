package practice.oop.test;

public class Shallow implements Cloneable{
	
	private int roll;
	
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
