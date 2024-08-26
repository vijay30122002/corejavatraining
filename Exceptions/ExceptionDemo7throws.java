package com.evergent.corejava.Exceptions;

public class ExceptionDemo7throws {

	String name=null;
	int k=0;
	public void myData() throws NullPointerException {
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
	public void myChange() {
		myData();
		System.out.println("my change method");
		
	}
	public static void main (String[] args)throws NullPointerException {
		try {
			ExceptionDemo7throws ed=new ExceptionDemo7throws();
			ed.myChange();
			
		}
		catch(Exception e){
			System.out.println("i  can handle"+e);
		}
	}
}
