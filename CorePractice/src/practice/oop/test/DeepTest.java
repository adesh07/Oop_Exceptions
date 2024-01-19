package practice.oop.test;

public class DeepTest {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		DeepAddress add = new DeepAddress();
		add.setCity("Pune");
		
		DeepStudent s1 = new DeepStudent();
		s1.setId(100);
		s1.setAdd(add);
		
		DeepStudent s2  = (DeepStudent) s1.clone();
		s2.setId(200);
		s2.add.city = "Bhopal";
		
		System.out.println(s1.getId() + " "	+ s1.getAdd().city);
		System.out.println(s2.getId() + " "	+ s2.getAdd().city);
		
	}

}
