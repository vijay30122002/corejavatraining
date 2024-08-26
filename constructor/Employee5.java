package com.evergent.corejava.constructor;

public class Employee5 {

	int eno;
	String ename;
	double sal;
	Employee5(){
		System.out.println("this is constructor");
	}
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno,String ename,double sal)
		{
	this(eno);
	this.ename=ename;
	this.sal=sal;
		
	}
	public void show() {
		System.out.println("Employee name is"+ename);
		System.out.println("Employee no is"+eno);
		System.out.println("Employee salary is"+sal);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Employee5(); 
		new Employee5(123,"vijay",55000).show();
		
		
		
	}

}
