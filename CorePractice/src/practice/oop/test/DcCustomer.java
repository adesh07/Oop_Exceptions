package practice.oop.test;

public class DcCustomer implements Cloneable {

	public String name;
	public DcAccount account;

	public DcCustomer(String name, DcAccount account) {
		this.name = name;
		this.account = account;
	}

	public Object clone() throws CloneNotSupportedException {
		DcCustomer cus = (DcCustomer) super.clone();
		cus.account = (DcAccount) account.clone();
		return cus;
	}

}