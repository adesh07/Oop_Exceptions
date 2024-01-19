package com.oop.immutable;

/*The below class is immutable because:

1.The instance variable of the class is final 
   i.e. we cannot change the value of it after creating an object.
2.The class is final so we cannot create the subclass.
3.There is no setter methods i.e. we have no option to change
    the value of the instance variable.
*/
//1
public final class MyImmutable {

//2
	private final int id;

//3	
	public MyImmutable(int id) {
		this.id=id;
	}
	
//4
	public int getId() {
		return id;
	}
	
}


