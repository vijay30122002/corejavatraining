package com.evergent.corejava.Exceptions;

public class ExceptionDemo5 {

	String name=null;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("this is finally block");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ed= new ExceptionDemo5();
		ed.myData();
	}
}
