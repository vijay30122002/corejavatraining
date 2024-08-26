package com.evergent.corejava.Exceptions;

public class ExceptionDemo4 {

	String name=null;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
		}
		catch(NullPointerException e) {
			System.out.println("i can handle "+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo4 ed= new ExceptionDemo4();
		ed.myData();
	}
}
