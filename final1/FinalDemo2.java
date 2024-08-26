package com.evrgent.corejava.final1;

class Myclass{
	final public void myProduct() {
		System.out.println("my product only");
	}
}
public class FinalDemo2 extends Myclass{

	
	final String name="India";
	public void myProduct1() {
		System.out.println("thus is new method");
	}
	public void myData() {
		System.out.println(name);
	}
	public static void Main(String[] args) {
		// TODO Auto-generated method stub
FinalDemo2 fDemo2=new FinalDemo2();
fDemo2.myData();
fDemo2.myProduct1();

		
	}

}
