package com.evergent.corejava.strings.immutable;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable person=new PersonImmutable("Vijay",21);
		System.out.println("name "+person.myName());
System.out.println("age "+person.myAge());
	}

}
