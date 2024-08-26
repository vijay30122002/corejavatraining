package com.evergent.corejava.constructor;

public class Employee2 {

	int eno;
	String ename;
	double sal;
	Employee2(){
		System.out.println("this is constructor");
	}
	Employee2(int eno1,String ename1,double sal1)
		{
	eno=eno1;
	ename=ename1;
	sal=sal1;
		
	}
	public void show() {
		System.out.println("Employee name is"+ename);
		System.out.println("Employee no is"+eno);
		System.out.println("Employee salary is"+sal);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Employee2(); 
		Employee2 em=new Employee2(123,"vijay",55000);
		em.show();
		
		
	}

}
