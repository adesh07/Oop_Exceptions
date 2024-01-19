package practice.oop.test;

public class ShallowAccTest {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		ShallowAcc a1 = new ShallowAcc(200);
		
		ShallowAcc a2 = (ShallowAcc) a1.clone();
		a2.balance = 200;
		
		System.out.println(a1.balance);
		System.out.println(a2.balance);
		
	}

}
