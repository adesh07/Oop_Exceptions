package practice.oop.test;

public class DC_Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		DcAccount acc = new DcAccount(100);

		DcCustomer c1 = new DcCustomer("awd", acc);

		DcCustomer c2 = (DcCustomer) c1.clone();
		c2.name = "opi";
		c2.account.balance = 200;

		System.out.println(c1.name + " " + c1.account.balance);
		System.out.println(c2.name + " " + c2.account.balance);
	}
}