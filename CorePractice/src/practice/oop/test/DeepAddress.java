package practice.oop.test;

public class DeepAddress implements Cloneable{
	
	public String city;
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}


}
