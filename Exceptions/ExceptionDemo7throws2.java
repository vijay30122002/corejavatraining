package com.evergent.corejava.Exceptions;

public class ExceptionDemo7throws2 {

	String name=null;
	int k=0;
	public void myData() {
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo7throws2 ed=new ExceptionDemo7throws2();
			ed.myData();
			
		}
		catch(Exception e){
			System.out.println("i  can handle"+e);
		}
		System.out.println("vijay");
	}
}
