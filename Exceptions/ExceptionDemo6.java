package com.evergent.corejava.Exceptions;

public class ExceptionDemo6 {

	String name=null;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
		}
		finally {
			System.out.println("this is finally block");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6 ed= new ExceptionDemo6();
		ed.myData();
	}
}
