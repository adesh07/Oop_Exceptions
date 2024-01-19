package practice.oop.test;

public class ShallowAcc implements Cloneable{
	
	public int  balance;
	
	public ShallowAcc(int balance) {
		this.balance = balance;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
