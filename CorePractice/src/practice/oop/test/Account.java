package practice.oop.test;

public class Account {

	public int balance = 0;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amt) {
		int newBalance = getBalance() + amt;
		setBalance(newBalance);
	}

	public void withdrawal(int amt) {
		int remainingBalance = getBalance() - amt;
		if (remainingBalance < 2000) {
			System.out.println("Insufficient Funds!!!");
		} else {
			setBalance(remainingBalance);
			System.out.println("Remaining Balance : " + getBalance());
		}
	}

}