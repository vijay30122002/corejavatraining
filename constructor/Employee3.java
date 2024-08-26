package com.evergent.corejava.constructor;

public class Employee3 {

	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("this is constructor");
	}
	Employee3(int eno,String ename,double sal)
		{
	this.eno=eno;
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

		new Employee3(); 
		new Employee3(123,"vijay",55000).show();
		
		
		
	}

}
