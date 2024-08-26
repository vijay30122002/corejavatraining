package com.evergent.corejava.oops;

public class Person {

	
int age=20;
String name="vijay";
String addres="Hyderabad";
public void display() {
	System.out.println("person name is"+name);
	System.out.println("person age is"+age);
	System.out.println("person addres is"+addres);

	
}
public static void main(String[] args) {
Person per =new Person();
per.display();
	}

}
