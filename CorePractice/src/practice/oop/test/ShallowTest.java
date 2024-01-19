package practice.oop.test;

public class ShallowTest{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Shallow s1  = new Shallow();
		s1.setRoll(100);
		
		Shallow s2 =  (Shallow) s1.clone();
		s2.setRoll(200);
		
		System.out.println(s1.getRoll());
		System.out.println(s2.getRoll());
		
	}
	
}