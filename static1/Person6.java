package com.evergent.corejava.static1;

public class Person6 {

	 String name="vijay";
	int age=20;
	String address="hyderabad";
	public void display() {
		name="Welcome";
		System.out.println("name is "+name);
		System.out.println("age is "+age);
		System.out.println("address "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person6 p1=new Person6();
		p1.display();
		Person6 p2=new Person6();
		p2.display();
	}

}
