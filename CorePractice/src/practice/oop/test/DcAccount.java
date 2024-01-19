package practice.oop.test;

public class DcAccount implements Cloneable{
	
	public int balance;
	
	public DcAccount(int balance) {
		this.balance = balance;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}