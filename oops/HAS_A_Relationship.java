package com.evergent.corejava.oops;

public class HAS_A_Relationship {

	public void show() {
		System.out.println("show method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HAS_A_Relationship has =new HAS_A_Relationship();
		has.show();
		Person per=new Person();
		per.display();
	}

}
