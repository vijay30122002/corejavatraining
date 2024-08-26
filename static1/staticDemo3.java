package com.evergent.corejava.static1;

import java.security.PublicKey;

public class staticDemo3 {
static String cname="India";
String name="ravi";
static public void myData() {
	System.out.println("mydata");
}
public void myshow() {
	System.out.println("myshow non static method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(cname);
		myData();
	
		
		
	}

}
