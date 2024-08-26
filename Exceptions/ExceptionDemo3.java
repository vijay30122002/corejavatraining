package com.evergent.corejava.Exceptions;

public class ExceptionDemo3 {

	String name=null;
	int k=0;
	public void myData() {
		try {
			System.out.println(name.length());
			int t=10/k;
			
			System.out.println(t);
			
		}
		catch(ArithmeticException e) {
			System.out.println("i can handle "+e);
		}
		catch(NullPointerException e) {
			System.out.println("i can handle "+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo3 ed= new ExceptionDemo3();
		ed.myData();
	}
}
